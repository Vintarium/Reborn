package by.education.vintilov.project_two.Strategy_Pattern.java.Implementations;

import by.education.vintilov.project_two.Strategy_Pattern.java.AlgorithmStrategy;

public class Fibonacci_sequence implements AlgorithmStrategy {


    @Override
    public int[] loopFor(int numberForSequence) {
        int[] outputSequence = new int[0];
        if (numberForSequence > 2) {
            outputSequence = new int[numberForSequence];
            outputSequence[0] = 0;
            outputSequence[1] = 1;
            for (int i = 2; i < outputSequence.length; i++) {
                outputSequence[i] = outputSequence[i - 1] + outputSequence[i - 2];
            }
            return outputSequence;
        } else {
            return outputSequence = new int[0];
        }
    }

    @Override
    public int[] loopWhile(int numberForSequence) {
        int[] outputSequence = new int[0];

        if (numberForSequence > 2) {
            outputSequence = new int[numberForSequence];
            outputSequence[0] = 0;
            outputSequence[1] = 1;
            int iteration = 2;

            while (numberForSequence > iteration) {
                outputSequence[iteration] = outputSequence[iteration - 1] + outputSequence[iteration - 2];
                iteration++;
                if (iteration > numberForSequence) {
                    break;
                }
            }
        }
        return outputSequence;
    }


    @Override
    public int[] loopDoWhile(int numberForSequence) {
        int[] outputSequence = new int[0];
        if (numberForSequence > 2) {
            outputSequence = new int[numberForSequence];
            outputSequence[0] = 0;
            outputSequence[1] = 1;
            int iteratoin = 2;
            do {
                outputSequence[iteratoin] = outputSequence[iteratoin - 1] + outputSequence[iteratoin - 2];
                iteratoin++;
            } while (iteratoin < numberForSequence);
        }
        return outputSequence;
    }
}
