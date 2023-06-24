package by.education.vintilov.project_two.Strategy_Pattern.java;

import by.education.vintilov.project_two.Strategy_Pattern.java.Implementations.Factorial;
import by.education.vintilov.project_two.Strategy_Pattern.java.Implementations.Fibonacci_sequence;
import java.util.Arrays;

public class Context {
    private int kindOfAlgorithm;
    private int kindOfLoop;
    private int valueForCalculating;

    private AlgorithmStrategy algorithmStrategy;

    public Context(int kindOfAlgorithm, int kindOfLoop, int valueForCalculating) {
        this.kindOfAlgorithm = kindOfAlgorithm;
        this.kindOfLoop = kindOfLoop;
        this.valueForCalculating = valueForCalculating;

        if (kindOfAlgorithm == 1) algorithmStrategy = new Fibonacci_sequence();
        else if (kindOfAlgorithm == 2) algorithmStrategy = new Factorial();

    }

    public void calcilateSequence() {
        if (kindOfLoop == 1)
            System.out.println(Arrays.toString(useLoopFor(algorithmStrategy, valueForCalculating)));
        else if (kindOfLoop == 2)
            System.out.println(Arrays.toString(useLoopWhile(algorithmStrategy, valueForCalculating)));
        else if (kindOfLoop == 3)
            System.out.println(Arrays.toString(useLoopDoWhile(algorithmStrategy, valueForCalculating)));
        else System.out.println("Incorrect value.Try again");
    }

    private int[] useLoopFor(AlgorithmStrategy algorithmStrategy, int valueForCalculating) {
        return algorithmStrategy.loopFor(valueForCalculating);

    }
    private int[] useLoopWhile(AlgorithmStrategy algorithmStrategy, int valueForCalculating) {
        return algorithmStrategy.loopWhile(valueForCalculating);
    }
    private int[] useLoopDoWhile(AlgorithmStrategy algorithmStrategy, int valueForCalculating) {
        return algorithmStrategy.loopDoWhile(valueForCalculating);
    }
}

