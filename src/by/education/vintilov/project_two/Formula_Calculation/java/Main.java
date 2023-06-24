package by.education.vintilov.project_two.Formula_Calculation.java;

import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        double answer;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your integer numbers (Press Enter after each number): ");
        int firstArgument = scanner.nextInt();
        int secondArgument = scanner.nextInt();
        System.out.println("Enter your double numbers. Use comma ',' between digits");
        double thirdArgument = scanner.nextDouble();
        double fourthArgument = scanner.nextDouble();
        answer = ((4 * (Math.pow(Math.PI, 2)))
                * Math.pow(firstArgument, 3)) / ((Math.pow(secondArgument, 2))
                * (thirdArgument + fourthArgument));

        System.out.println(answer);

    }


}
