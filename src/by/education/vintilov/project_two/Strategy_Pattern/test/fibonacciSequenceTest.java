package by.education.vintilov.project_two.Strategy_Pattern.test;

import by.education.vintilov.project_two.Strategy_Pattern.java.Implementations.Fibonacci_sequence;
import org.junit.Test;

import static org.junit.Assert.*;

public class fibonacciSequenceTest {
    private final Fibonacci_sequence fibonacci_sequence = new Fibonacci_sequence();
    private final int[] expected = new int[]{0, 1, 1, 2, 3, 5, 8, 13, 21, 34};
    private final int valueForSequence = 10;

    @Test
    public void loopFor() {
        int[] actual = fibonacci_sequence.loopFor(valueForSequence);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void loopWhile() {
        int[] actual = fibonacci_sequence.loopWhile(valueForSequence);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void loopDoWhile() {
        int[] actual = fibonacci_sequence.loopDoWhile(valueForSequence);
        assertArrayEquals(expected, actual);
    }

}