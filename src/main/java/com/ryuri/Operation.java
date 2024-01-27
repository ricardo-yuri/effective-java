package com.ryuri;

import java.util.function.IntBinaryOperator;

public enum Operation {
    ADD((x, y) -> x + y),
    SUBSTRACT ((x, y) -> x - y),
    MULTIPLY ((x , y) -> x * y),
    DIVIDE ((x, y) -> x / y);

    private final IntBinaryOperator operator;

    Operation(IntBinaryOperator operator) {
        this.operator = operator;
    }

    public int compute(int x, int y) {
        return operator.applyAsInt(x, y);
    }
}