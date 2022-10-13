/*
 * 2.23 (Odd or Even) Write an application tha reads an integer
 * and determines and prints whether it's odd or even. [Hint: Use
 * the remainder operator. An even number is multiple of 2. Any
 * multiple of 2 leaves a remainder of 0 when divided by 2.]
 */
package ch02.ex02_25;

import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {
        int number, result;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        number = input.nextInt();
        input.close();

        result = number % 2;
        if (result == 0) {
            System.out.printf("This number is even: %d%n", number);
        } else {
            System.out.printf("This number is odd: %d%n", number);
        }
    }
}
