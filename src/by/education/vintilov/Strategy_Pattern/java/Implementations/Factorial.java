package by.education.vintilov.Strategy_Pattern.java.Implementations;

import by.education.vintilov.Strategy_Pattern.java.AlgorithmStrategy;

public class Factorial implements AlgorithmStrategy {

    @Override
    public int[] loopFor(int factorialOfANumber) {
        int[] solutionStorageArray = new int[1];
        int factorialCalculationResult = 1;
        for (int i = 1; i <= factorialOfANumber; i++) {
            factorialCalculationResult *= i;
        }
        solutionStorageArray[0] = factorialCalculationResult;
        return solutionStorageArray;
    }

    @Override
    public int[] loopWhile(int factorialOfANumber) {
        int[] solutionStorageArray = new int[1];
        int factorialCalculationResult = 1;
        int b = 1;
        do {
            factorialCalculationResult = factorialCalculationResult * b++;
        }
        while (b <= factorialOfANumber);
        solutionStorageArray[0] = factorialCalculationResult;
        return solutionStorageArray;
    }

    @Override
    public int[] loopDoWhile(int factorialOfANumber) {
        int[] solutionStorageArray = new int[1];
        int factorialCalculationResult = 1;
        int b = 1;
        while (b <= factorialOfANumber) {
            factorialCalculationResult *= b++;
        }
        solutionStorageArray[0] = factorialCalculationResult;
        return solutionStorageArray;
    }
}
