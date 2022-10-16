package ch05.ex05_11;

import java.util.Scanner;

public class SmallestValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of values to input: ");
        int totalValues = input.nextInt();

        int smallest = 0;

        for (int i = 0; i < totalValues; i++) {
            System.out.print("Enter a integer: ");
            int number = input.nextInt();

            if (i == 0)
                smallest = number;
            if (number < smallest)
                smallest = number;
        }
        input.close();
        if (totalValues > 0)
            System.out.printf("%nSmallest is %d", smallest);
        else
            System.out.println("\nNo values were entered");
    }
}
