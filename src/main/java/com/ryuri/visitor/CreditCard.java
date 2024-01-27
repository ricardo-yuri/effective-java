package com.ryuri.visitor;

public sealed abstract class CreditCard permits Visa, MasterCard{

    public abstract <T> T doSomething(CardVisitor<T> visitor);

    public static void main(String[] args) {
        CardVisitor<Integer> visitor = new CardVisitor<Integer>() {

            @Override
            public Integer visit(Visa visa) {
                return 1;
            }

            @Override
            public Integer visit(MasterCard masterCard) {
                return 2;
            }
        };

        System.out.println(visitor.visit(new Visa()));
    }
}

final class Visa extends CreditCard {

    @Override
    public <T> T doSomething(CardVisitor<T> visitor) {
        return visitor.visit(this);
    }

}

final class MasterCard extends CreditCard {

    @Override
    public <T> T doSomething(CardVisitor<T> visitor) {
        return visitor.visit(this);
    }

}