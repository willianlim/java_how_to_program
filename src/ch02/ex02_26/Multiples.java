/*
 * 2.26 (Multiples) Write an application that reads two integers, determines
 * whether the first is a multiple of the second and prints the result. [Hint:
 * Use the remainder operator.]
 */
package ch02.ex02_26;

import java.util.Scanner;

public class Multiples {

    public static void main(String[] args) {
        int number1, number2;
        int result;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        number1 = input.nextInt();

        System.out.println("Enter the second number: ");
        number2 = input.nextInt();
        input.close();

        result = number1 % number2;
        if (result == 0)
            System.out.printf("The number %d is a multiple of %d%n", number1, number2);
        else if (result != 0)
            System.out.printf("The number %d is not a multiple of %d%n", number1, number2);
    }
}
