package com.ryuri.visitor;

public class PartternMatching {

    public int run(CreditCard card) {
        int i = 5;
        switch (i) {
            case 1:
                System.out.println("a");
        }
        return switch (card) {
            case Visa v -> 1;
            case MasterCard m -> 2;
//            default -> throw new UnsupportedOperationException();
        };
    }
}

class OtherPartternMatching {

    public String run(CreditCard card) {
        return switch (card) {
            case Visa v -> "abc";
            case MasterCard m -> "cde";
//            default -> throw new UnsupportedOperationException();
        };
    }
}
