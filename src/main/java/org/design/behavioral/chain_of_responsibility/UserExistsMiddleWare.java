package org.design.behavioral.chain_of_responsibility;

public class UserExistsMiddleWare extends MiddleWare {
    private Server server;

    public UserExistsMiddleWare(Server server) {
        this.server = server;
    }

    public boolean check(String email, String password) {
        if (!server.hasEmail(email)) {
            System.out.println("This email is not registered!");
            return false;
        }
        if (!server.isValidPassword(email, password)) {
            System.out.println("Wrong password!");
            return false;
        }
        return checkNext(email, password);
    }
}
