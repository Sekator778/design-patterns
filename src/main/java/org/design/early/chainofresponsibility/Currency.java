package org.design.early.chainofresponsibility;

public class Currency {

    private final int amount;

    public Currency(int amt) {
        this.amount = amt;
    }

    public int getAmount() {
        return this.amount;
    }
}