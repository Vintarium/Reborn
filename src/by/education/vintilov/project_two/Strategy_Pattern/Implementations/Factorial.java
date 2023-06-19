package by.education.vintilov.project_two.Strategy_Pattern.Implementations;

import by.education.vintilov.project_two.Strategy_Pattern.AlgorithmStrategy;

public class Factorial implements AlgorithmStrategy {

    @Override
    public int loopFor(int factorialOfANumber) {
        int factorialCalculationResult = 1;
        for (int i = 1; i <= factorialOfANumber; i++) {
            factorialCalculationResult *= i;
        }
        System.out.println("Factorial Calculation Result: " + factorialCalculationResult);
        return factorialCalculationResult;
    }

    @Override
    public int loopWhile(int factorialOfANumber) {
        int factorialCalculationResult = 1;
        int b = 1;
        do {
            factorialCalculationResult = factorialCalculationResult * b++;
        }
        while (b <= factorialOfANumber);
        System.out.println("Factorial Calculation Result: " + factorialCalculationResult);
        return factorialCalculationResult;
    }

    @Override
    public int loopDoWhile(int factorialOfANumber) {
        int factorialCalculationResult = 1;
        int b = 1;
        while (b <= factorialOfANumber) {
            factorialCalculationResult *= b++;
        }
        System.out.println("Factorial Calculation Result: " + factorialCalculationResult);
        return factorialCalculationResult;
    }
}
