package by.education.vintilov.project_two.Strategy_Pattern.java;

import by.education.vintilov.project_two.Strategy_Pattern.java.Implementations.Factorial;
import by.education.vintilov.project_two.Strategy_Pattern.java.Implementations.Fibonacci_sequence;

public class Context {
    int kindOfAlgorithm;
    int kindOfLoop;
    int valueForCalculating;

    private AlgorithmStrategy algorithmStrategy;

    public Context(int kindOfAlgorithm, int kindOfLoop, int valueForCalculating) {
        this.kindOfAlgorithm = kindOfAlgorithm;
        this.kindOfLoop = kindOfLoop;
        this.valueForCalculating = valueForCalculating;
    }

    public int[] calcilateSequence() {
        if (kindOfAlgorithm == 1) {
            algorithmStrategy = new Fibonacci_sequence();
            if (kindOfLoop == 1)  return algorithmStrategy.loopFor(valueForCalculating);
            else if (kindOfLoop == 2) return algorithmStrategy.loopWhile(valueForCalculating);
            else if (kindOfLoop == 3) return algorithmStrategy.loopDoWhile(valueForCalculating);
            else System.out.println("Incorrect value.Try again");

        } else if (kindOfAlgorithm == 2) {
            algorithmStrategy = new Factorial();
            if (kindOfLoop == 1) return algorithmStrategy.loopFor(valueForCalculating);
            else if (kindOfLoop == 2) return  algorithmStrategy.loopWhile(valueForCalculating);
            else if (kindOfLoop == 3) return algorithmStrategy.loopDoWhile(valueForCalculating);
            else System.out.println("Incorrect value.Try again");

        } else System.out.println("Incorrect value.Try again");
        return new int[0];
    }
}

