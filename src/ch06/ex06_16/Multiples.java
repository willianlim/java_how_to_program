package ch06.ex06_16;

import java.util.Scanner;

public class Multiples {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number1 = input.nextInt();

        System.out.print("Enter another integer: ");
        int number2 = input.nextInt();
        input.close();

        System.out.printf("%n%d is a multiple of %d? %s", number2, number1, isMultiple(number1, number2));
    }

    public static boolean isMultiple(int number1, int number2) {
        if (number2 % number1 == 0)
            return (true);
        return (false);
    }
}
