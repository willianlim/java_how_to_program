package ch06.ex06_14;

import java.util.Scanner;

public class Exponentiation {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer value for the base: ");
        int base = input.nextInt();

        System.out.print("Enter the exponent: ");
        int exponent = input.nextInt();
        input.close();

        System.out.printf("%n%d ^ %d = %d", base, exponent, integerPower(base, exponent));
    }

    public static int integerPower(int base, int exponent) {
        int result;

        result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return (result);
    }
}
