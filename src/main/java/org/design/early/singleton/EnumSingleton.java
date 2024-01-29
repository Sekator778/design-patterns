package org.design.early.singleton;

public enum EnumSingleton {

    INSTANCE;

    public static void doSomething(){
        System.out.println("I'm also singleton");
    }
}