package ch06.ex06_17;

import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        input.close();

        System.out.printf("%nIs %d even? %s", number, isEven(number));
    }

    public static boolean isEven(int number) {
        if (number % 2 == 0)
            return (true);
        return (false);
    }
}
