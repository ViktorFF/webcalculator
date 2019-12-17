package by.calculator.application.operation;

public class DivOperation implements Operation {
    @Override
    public double execute(int a, int b) {
        if (b != 0) {
            return a / (double)b;
        }
        return 0;
    }
}
