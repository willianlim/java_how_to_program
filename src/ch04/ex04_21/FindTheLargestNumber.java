/*
 * (Find the highest number) The process of finding the highest value is widely
 * used in computer applications. For example, a program that determines the
 * winner of a sales competition would enter the number of units sold by each
 * salesperson. The seller that sells the most units wins the competition.
 * Write a pseudocode program and then a Java application that accepts as input
 * a series of 10 integers and determines and prints the largest of the integers.
 * Your program must use at least the following three variables:
 */
package ch04.ex04_21;

import java.util.Scanner;

public class FindTheLargestNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int largest = 0;
        int counter = 1;

        while (counter <= 10) {
            System.out.print("Enter a integer: ");
            int number = input.nextInt();

            if (counter == 1)
                largest = number;
            else if (number > largest)
                largest = number;
            counter++;
        }
        input.close();
        System.out.printf("Largest is %d%n", largest);
    }
}
