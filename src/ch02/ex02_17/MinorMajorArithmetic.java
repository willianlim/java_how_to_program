package ch02.ex02_17;

import java.util.Scanner;

public class MinorMajorArithmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1;
        int number2;
        int number3;
        int sum, average, product, smaller, bigger;

        System.out.print("Enter first integer: ");
        number1 = input.nextInt();

        System.out.print("Enter second integer: ");
        number2 = input.nextInt();

        System.out.print("Enter third integer: ");
        number3 = input.nextInt();

        sum = number1 + number2 + number3;
        average = sum / 3;
        product = number1 * number2 * number3;

        System.out.printf("Sum: %d%n", sum);
        System.out.printf("Average: %d%n", average);
        System.out.printf("Product: %d%n", product);

        smaller = number1;
        if (number2 < smaller)
            smaller = number2;
        if (number3 < smaller)
            smaller = number3;

        bigger = number1;
        if (number2 > bigger)
            bigger = number2;
        if (number3 > bigger)
            bigger = number3;

        System.out.printf("Sum is %d%n", sum);
        System.out.printf("Average is %d%n", average);
        System.out.printf("Product is %d%n", product);
        System.out.printf("Smaller is %d%n", smaller);
        System.out.printf("Bigger is %d%n", bigger);
    }
}
