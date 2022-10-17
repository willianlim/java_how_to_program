package ch06.ex06_18;

import java.util.Scanner;

public class SquareOfAsterisks {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the side of the square.");
        int number = input.nextInt();
        input.close();
        squareOfAsterisks(number);
    }

    public static void squareOfAsterisks(int side) {
        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
