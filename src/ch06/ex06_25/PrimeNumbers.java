package ch06.ex06_25;

import java.util.Scanner;

public class PrimeNumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int number = input.nextInt();
        input.close();

        if (isPrime(number))
            System.out.printf("%n%d is prime", number);
        else
            System.out.printf("%n%d id not prime", number);
    }

    public static boolean isPrime(int number) {
        if (number < 2)
            return (false);
        if (number % 2 == 0 && number > 2)
            return (false);

        int root = (int) Math.sqrt(number);
        for (int i = 2; i <= root; i++) {
            if (number % i == 0)
                return (false);
        }
        return (true);
    }
}
