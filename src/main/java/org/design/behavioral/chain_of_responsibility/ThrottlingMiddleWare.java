package org.design.behavioral.chain_of_responsibility;

public class ThrottlingMiddleWare extends MiddleWare {
    private int requestPerMinute;
    private int request;
    private long currentTime;

    public ThrottlingMiddleWare(int requestPerMinute) {
        this.requestPerMinute = requestPerMinute;
        this.currentTime = System.currentTimeMillis();
    }

    public boolean check(String email, String password) {
        if (System.currentTimeMillis() > currentTime + 60_000) {
            request = 0;
            currentTime = System.currentTimeMillis();
        }

        request++;

        if (request > requestPerMinute) {
            System.out.println("Request limit exceeded!");
            Thread.currentThread().stop();
        }
        return checkNext(email, password);
    }
}
