package by.education.vintilov.Finding_the_Median.test;

import by.education.vintilov.Finding_the_Median.java.MedianValue;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MedianValueTest {
    MedianValue medianValue = new MedianValue();

    @Test
    public void testIntMedian() {
        double result = medianValue.findMediana(new double[] { 5, 5, 5, 100, 5, 5, 5, 5 });
        Assert.assertEquals(5, result, 0);
    }

    @Test
    public void testIntMedianOddNumber() {
        double result = medianValue.findMediana(new double[] {1, 5, 2, 8, 7});
        Assert.assertEquals(5, result, 0);
    }

    @Test
    public void testIntMedianEvenNumber() {
        double result = medianValue.findMediana(new double[] {1, 6, 2, 8, 7, 2});
        Assert.assertEquals(4, result, 0);
    }

    @Test
    public void testIntMedianEvenAverage() {
        double result = medianValue.findMediana(new double[] {1, 2, 3, 4});
        Assert.assertEquals(2.5, result, 0);
    }

    @Test
    public void testDoubleMedian() {
        double result = medianValue.findMediana(new double[] { 1, 0.5, 0.5, 0.5, 0.5, 0.55, 0.5, 0.5});
        Assert.assertEquals(0.5, result, 0);
    }

    @Test
    public void testDoubleMedianOddNumber() {
        double result = medianValue.findMediana(new double[] { 0.5, 0.2, 0.4, 0.3, 0.1});
        Assert.assertEquals(0.3, result, 0);
    }

    @Test
    public void testDoubleMedianEvenAverage() {
        double result = medianValue.findMediana(new double[] { 0.1, 0.2, 0.3, 0.4, 0.2, 0.5});
        Assert.assertEquals(0.25, result, 0);
    }

}