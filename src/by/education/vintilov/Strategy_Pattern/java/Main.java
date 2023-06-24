package by.education.vintilov.Strategy_Pattern.java;

public class Main {
    public static void main(String[] args) {

        Context context = new Context(  1, 1, 10);
        context.calcilateSequence();

        Context context1 = new Context(2, 2, 7);
        context1.calcilateSequence();

        Context context3 = new Context(2, 3, 15);
        context3.calcilateSequence();

    }
}
