package by.education.vintilov.project_two.Strategy_Pattern;

import by.education.vintilov.project_two.Strategy_Pattern.Implementations.Factorial;
import by.education.vintilov.project_two.Strategy_Pattern.Implementations.Fibonacci_sequence;

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

    public void calcilateSequence() {
        if (kindOfAlgorithm == 1) {
            algorithmStrategy = new Fibonacci_sequence();
            if (kindOfLoop == 1) algorithmStrategy.loopFor(valueForCalculating);
            else if (kindOfLoop == 2) algorithmStrategy.loopWhile(valueForCalculating);
            else if (kindOfLoop == 3) algorithmStrategy.loopDoWhile(valueForCalculating);
            else System.out.println("Incorrect value.Try again");

        } else if (kindOfAlgorithm == 2) {
            algorithmStrategy = new Factorial();
            if (kindOfLoop == 1) algorithmStrategy.loopFor(valueForCalculating);
            else if (kindOfLoop == 2) algorithmStrategy.loopWhile(valueForCalculating);
            else if (kindOfLoop == 3) algorithmStrategy.loopDoWhile(valueForCalculating);
            else System.out.println("Incorrect value.Try again");

        } else System.out.println("Incorrect value.Try again");
    }
}

