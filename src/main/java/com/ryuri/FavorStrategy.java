package com.ryuri;

import com.google.common.base.Preconditions;

import java.util.function.Supplier;

public class FavorStrategy {

    private final Supplier<String> supplier;

    public FavorStrategy(Supplier<String> supplier) {
        this.supplier = supplier;
    }

    public static FavorStrategy of(Supplier<String> supplier) {
        Preconditions.checkNotNull(supplier);
        return new FavorStrategy(supplier);
    }

    public void doSomething() {
        System.out.println("a");
        System.out.println("a");
        System.out.println("a");
        System.out.println("a");
        System.out.println(supplier.get());
        System.out.println("b");
        System.out.println("b");
        System.out.println("b");
        System.out.println("b");
    }

    public static void main(String[] args) {
        FavorStrategy.of(() -> "123").doSomething();
        FavorStrategy.of(() -> "321").doSomething();
    }
}
