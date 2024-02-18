package org.design.behavioral.chain_of_responsibility;

import java.util.HashMap;
import java.util.Map;

public class Server {
    private Map<String, String> users = new HashMap<>();
    private MiddleWare middleWare;

    /**
     * Client can configure the server with a chain of middleware objects.
     */
    public void setMiddleWare(MiddleWare middleWare) {
        this.middleWare = middleWare;
    }

    /**
     * Server gets a request and passes it to the chain.
     */
    public boolean logIn(String email, String password) {
        if (middleWare.check(email, password)) {
            System.out.println("User with email: " + email + " has been successfully logged in.");
            return true;
        }
        return false;
    }

    public void register(String email, String password) {
        users.put(email, password);
    }

    public boolean hasEmail(String email) {
        return users.containsKey(email);
    }

    public boolean isValidPassword(String email, String password) {
        return users.get(email).equals(password);
    }
}
