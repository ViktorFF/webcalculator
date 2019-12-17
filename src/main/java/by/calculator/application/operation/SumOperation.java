package by.calculator.application.operation;

public class SumOperation implements Operation {
    @Override
    public double execute(int a, int b) {
        return a + b;
    }
}
