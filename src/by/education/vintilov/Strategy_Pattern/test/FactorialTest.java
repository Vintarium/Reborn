package by.education.vintilov.Strategy_Pattern.test;

import by.education.vintilov.Strategy_Pattern.java.Implementations.Factorial;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {
    private final Factorial factorial = new Factorial();
    private final int[] expected = new int[]{120};
    private final int valueForSequence = 5;

    @Test
    public void loopFor() {
        int[] actual = factorial.loopFor(valueForSequence);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void loopWhile() {
        int[] actual = factorial.loopWhile(valueForSequence);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void loopDoWhile() {
        int[] actual = factorial.loopDoWhile(valueForSequence);
        assertArrayEquals(expected, actual);
    }
}