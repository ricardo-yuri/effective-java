package com.ryuri;

public abstract class AbstractTemplate {

    public void doSomething() {
        System.out.println("a");
        System.out.println("a");
        System.out.println("a");
        System.out.println("a");
        System.out.println(getValue());
        System.out.println("b");
        System.out.println("b");
        System.out.println("b");
        System.out.println("b");

    }

    public abstract String getValue();

    class OneImplementation extends AbstractTemplate {
        @Override
        public String getValue() {
            return "123";
        }
    }

    class TwoImplementation extends AbstractTemplate {
        @Override
        public String getValue() {
            return "123";
        }
    }
}
