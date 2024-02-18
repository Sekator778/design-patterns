package org.design.behavioral.chain_of_responsibility;

/**
 * Base middleware class with default link to the next object in the chain of responsibility.
 */
public abstract class MiddleWare {
    private MiddleWare next;

    /**
     * Builds chains of middleware objects.
     */
    public static MiddleWare link(MiddleWare first, MiddleWare... chain) {
        MiddleWare head = first;
        for (MiddleWare nextChain : chain) {
            head.next = nextChain;
            head = nextChain;
        }
        return first;
    }

    /**
     * Subclasses will implement this method with concrete checks.
     */
    public abstract boolean check(String email, String password);

    public boolean checkNext(String email, String password) {
        if (next == null) {
            return true;
        }
        return next.checkNext(email, password);
    }

}
