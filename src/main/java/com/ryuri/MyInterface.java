package com.ryuri;

@java.lang.FunctionalInterface
public interface MyInterface {

    public void doSomething();

    default void doOtherThing() {
        System.out.println("test");
    }
}
