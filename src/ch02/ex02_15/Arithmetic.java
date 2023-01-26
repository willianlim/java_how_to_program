package ch02.ex02_15;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1;
        int number2;
        int sum, mul, sub, div;

        System.out.print("Enter first integer: ");
        number1 = input.nextInt();

        System.out.print("Enter second integer: ");
        number2 = input.nextInt();
        input.close();

        sum = number1 + number2;
        mul = number1 * number2;
        sub = number1 - number2;
        div = number1 / number2;

        System.out.printf("Sum: %d%n", sum);
        System.out.printf("Mul: %d%n", mul);
        System.out.printf("Sub: %d%n", sub);
        System.out.printf("Div: %d%n", div);
    }
}
