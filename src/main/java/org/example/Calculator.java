package org.example;

import org.example.calculate.*;

import java.util.List;

public class Calculator {
    // 4. 각각의 구현체들을 인터페이스인 NewArithmerticOperator를 통해서 받는다. 더 이상 ENUM 사용 x
    private static final List<NewArithmeticOperator> arthemeticOperators = List.of(new AdditionOperator(), new SubtractionOperator(), new MultiplicationOperator(), new DivisionOperator());

    public static int calculate(int operand1, String operator, int operand2) {
        return arthemeticOperators.stream()
                .filter(arthemeticOperator -> arthemeticOperator.supports(operator))
                .map(arthemeticOperator -> arthemeticOperator.calculate(operand1, operand2))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("올바른 사칙연산이 아닙니다."));
    }

    // 2. calculate 안에서 수행할 수도 있지만 ArithmeticOperator를 만들어서 해당 ENUM에게 다시 한 번 작업을 위임한다.
    // public static int calculate(int operand1, String operator, int operand2) {
    // return ArithmeticOperator.calculate(operand1, operator, operand2);
    // }

}
