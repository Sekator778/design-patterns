package org.design.behavioral.chain_of_responsibility;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Demo {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Server server;

    private static void init() {
        server = new Server();
        server.register("admin@example.com", "admin_pass");
        server.register("user@example.com", "user_pass");

        // All checks are linked. Client can build various chains using the same components.
        MiddleWare middleware = MiddleWare.link(
                new ThrottlingMiddleWare(2),
                new UserExistsMiddleWare(server),
                new RoleCheckMiddleWare()
        );

        // Server gets a chain from the client code.
        server.setMiddleWare(middleware);
    }

    public static void main(String[] args) {
        init();

        boolean success;
        do {
            System.out.println("Enter email: ");
            String email = null;
            try {
                email = reader.readLine();
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("Input password: ");
            String password = null;
            try {
                password = reader.readLine();
            } catch (Exception e) {
                e.printStackTrace();
            }
            success = server.logIn(email, password);
        } while (!success);
    }
}
