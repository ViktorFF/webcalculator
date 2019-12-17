package by.calculator;

import by.calculator.application.operation.*;

import java.util.HashMap;
import java.util.Map;

public class Calculator {
    private static Map<String, Operation> operationMap = new HashMap<String, Operation>() {
        {
            this.put("sum", new SumOperation());
            this.put("sub", new SubOperation());
            this.put("mult", new MultOperation());
            this.put("div", new DivOperation());
        }
    };

    public static double start(int a, int b, String operationType) {
        Operation operation = operationMap.get(operationType);
        return operation.execute(a, b);
    }
}
