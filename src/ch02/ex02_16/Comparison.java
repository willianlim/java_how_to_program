package ch02.ex02_16;

import java.util.Scanner;

public class Comparison {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1;
        int number2;

        System.out.print("Enter first integer: ");
        number1 = input.nextInt();

        System.out.print("Enter second integer: ");
        number2 = input.nextInt();
        input.close();

        if (number1 > number2)
            System.out.printf("%d is larger", number1);
        else if (number1 < number2) {
            System.out.printf("%d is larger", number2);
        }

        if (number1 == number2)
            System.out.println("These numbers are equal");
    }
}
