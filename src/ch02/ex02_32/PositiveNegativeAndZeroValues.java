/*
 * 2.32 (Negative, Positive and Zero Values) Write a program that enters five
 * numbers, plus determines and prints how many negatives, how many positives
 * and how many zeros were entered.
 */
package ch02.ex02_32;

import java.util.Scanner;

public class PositiveNegativeAndZeroValues {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1, number2, number3, number4, number5;
        int negatives, positives, zeros;

        negatives = 0;
        positives = 0;
        zeros = 0;
        System.out.println("Enter the first value: ");
        number1 = input.nextInt();

        System.out.println("Enter the second value: ");
        number2 = input.nextInt();

        System.out.println("Enter the third value: ");
        number3 = input.nextInt();

        System.out.println("Enter the fourth value: ");
        number4 = input.nextInt();

        System.out.println("Enter the fifth value: ");
        number5 = input.nextInt();
        input.close();

        if (number1 == 0)
            zeros++;
        if (number2 == 0)
            zeros++;
        if (number3 == 0)
            zeros++;
        if (number4 == 0)
            zeros++;
        if (number5 == 0)
            zeros++;

        if (number1 < 0)
            negatives++;
        if (number2 < 0)
            negatives++;
        if (number3 < 0)
            negatives++;
        if (number4 < 0)
            negatives++;
        if (number5 < 0)
            negatives++;

        if (number1 > 0)
            positives++;
        if (number2 > 0)
            positives++;
        if (number3 > 0)
            positives++;
        if (number4 > 0)
            positives++;
        if (number5 > 0)
            positives++;

        System.out.println("Number of positives: " + positives);
        System.out.println("Number of negatives: " + negatives);
        System.out.println("Number of zeros: " + zeros);
    }
}
