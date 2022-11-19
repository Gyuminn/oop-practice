package org.example;

public class Calculator {
    // 2. calculate 안에서 수행할 수도 있지만 ArithmeticOperator를 만들어서 해당 ENUM에게 다시 한 번 작업을 위침한다.
    public static int calculate(int operand1, String operator, int operand2) {
        return ArithmeticOperator.calculate(operand1, operator, operand2);
    }
}
