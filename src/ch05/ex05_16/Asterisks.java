package ch05.ex05_16;

import java.util.Scanner;

public class Asterisks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[5];
        String[] bars = new String[5];

        for (int i = 0; i < numbers.length;)  {
            System.out.print("Enter a number between 1 and 30: ");
            numbers[i] = input.nextInt();

            if (numbers[i] < 1 || numbers[i] > 30)
                System.out.println(" - Error: number must is between 1-30. Try again!");
            else {
                for (int j = 0; j < numbers[i]; j++)
                    bars[i] += "*";
                i++;
            }
        }
        input.close();
        for (int i = 0; i < numbers.length; i++)
            System.out.printf("%02d = %s%n", numbers[i], bars[i]);
    }
}
