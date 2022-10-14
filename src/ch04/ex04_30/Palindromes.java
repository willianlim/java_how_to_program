/*
 * (Palindromes) A palindrome is a sequence of characters that is read from left
 * to right or from right to left. Per For example, each of the following
 * five-digit integers is a palindrome: 12321, 55555, 45554, and 11611. Write
 * an application that reads in a five-digit integer and determines whether or
 * not it is a palindrome. If the number is not five digits, display a message
 * error and allow the user to enter a new value.
 */
package ch04.ex04_30;

import java.util.Scanner;

public class Palindromes {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int originalNumber = 0;
        while (String.valueOf(originalNumber).length() != 5) {
            System.out.print("Enter a five-digit integer: ");
            originalNumber = input.nextInt();

            if (String.valueOf(originalNumber).length() != 5) {
                System.out.println("\nInvalid number. Try again.\n");
            }
        }
        input.close();
        int number = originalNumber;
        int reverseNumber = 0;

        while (number > 0) {
            int rem = number % 10;
            number /= 10;
            reverseNumber = (reverseNumber * 10) + rem;
        }

        if (originalNumber == reverseNumber)
            System.out.printf("%n%d is palindrome", originalNumber);
        else
            System.out.printf("%n%f is not palindrome", originalNumber);
    }
}
