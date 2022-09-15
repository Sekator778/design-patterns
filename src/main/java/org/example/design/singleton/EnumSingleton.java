package org.example.design.singleton;

public enum EnumSingleton {

    INSTANCE;

    public static void doSomething(){
        System.out.println("I'm also singleton");
    }
}