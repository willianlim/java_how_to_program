package ch02.ex02_15;

import java.util.Scanner;

public class Arithmetic {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number1;
        int number2;

        int sum;
        int product;
        int difference;
        int quotient;

        System.out.print("Enter first integer: ");
        number1 = input.nextInt();

        System.out.print("Enter second integer: ");
        number2 = input.nextInt();

        input.close();

        sum = number1 + number2;
        product = number1 * number2;
        difference = number1 - number2;
        quotient = number1 / number2;

        System.out.printf("the sum of the entered values is: %d%n", sum);
        System.out.printf("the product of the entered values is: %d%n", product);
        System.out.printf("the difference of the entered values is: %d%n", difference);
        System.out.printf("the quotient of the entered values is: %d%n", quotient);
    }
}
