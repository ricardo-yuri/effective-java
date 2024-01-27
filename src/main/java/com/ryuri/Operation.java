package com.ryuri;

public enum Operation {
    ADD {
        @Override
        public int compute(int x, int y){
            return x + y;
        }
    },
    SUBSTRACT {
        @Override
        public int compute(int x, int y) {
            return x - y;
        }
    },
    MULTIPLY {
        @Override
        public int compute(int x, int y) {
            return x * y;
        }
    },
    DIVIDE {
        @Override
        public int compute(int x, int y) {
            return x / y;
        }
    };

//    private final IntBinaryOperator operator;

//    Operation(IntBinaryOperator operator) {
//        this.operator = operator;
//    }

    public abstract int compute(int x, int y);

//    public int compute(int x, int y) {
//        return operator.applyAsInt(x, y);
//    }
}