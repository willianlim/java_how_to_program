package ch06.ex06_19;

import java.util.Scanner;

public class SquareOfAnyCharacter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the side of the square.");
        int number = input.nextInt();

        System.out.println("Enter the side of the square.");
        char fillCharacter = input.next().charAt(0);
        input.close();

        squareOfAnyCharacter(number, fillCharacter);
    }

    public static void squareOfAnyCharacter(int side, char fillCharacter) {
        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++)
                System.out.printf("%c", fillCharacter);
            System.out.println();
        }
    }
}
