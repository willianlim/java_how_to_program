/*
 * (Square of asterisks) Write an application that prompts the user to enter
 * the size of the side of a square and then displays a empty square of that
 *  size with asterisks. Your program should work with squares of all possible
 * side lengths. between 1 and 20
 */
package ch04.ex04_29;

import java.util.Scanner;

public class SquareOfAsterisks {

    public static void main(String[] args) {
        int j;
        int i;
        int sideSize;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of the side of square: ");
        sideSize = input.nextInt();
        input.close();

        if (sideSize < 1 || sideSize > 20) {
            System.out.println("square size not allowed");
            return ;
        }
        i = 0;
        while (i++ < sideSize) {
            j = 0;
            while (j++ < sideSize)
                System.out.print("*");
            System.out.println();
        }
    }
}
