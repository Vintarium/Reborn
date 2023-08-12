package by.education.vintilov.Finding_the_Median.java;
import java.util.Arrays;
public class MedianValue {

    public double findMediana(double [] array) {
        if (array.length % 2 != 0) {
            Arrays.sort(array);
            return array[array.length / 2];
        } else if (array.length % 2 == 0) {
            Arrays.sort(array);
            return (array[array.length / 2] + array[array.length / 2 - 1]) / 2;
        }
        return 0;
    }
}

