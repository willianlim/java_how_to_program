/*
 * Create and manipulate an Account object
 */
package ch03;

import java.util.Scanner;

public class AccountTest {

    public static void main(String[] args) {

        Account account1 = new Account("Jane Green", 50.00);
        Account account2 = new Account("John Blue", -7.53);

        // Displays opening balance of each object
        System.out.printf("%s balance: $%.2f %n",
                account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f %n",
                account2.getName(), account2.getBalance());

        // Create a Scanner to get input from the command window
        Scanner input = new Scanner(System.in);

        System.out.println("Enter deposit amount for account1: ");
        double depositAmount = input.nextDouble();
        System.out.printf("adding %.2f to account1 balance%n%n",
                depositAmount);
        account1.deposit(depositAmount);

        // display balances
        System.out.printf("%s balance: $%.2f %n",
                account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f %n%n",
                account2.getName(), account2.getBalance());

        System.out.println("Enter deposit amount for account2: ");
        depositAmount = input.nextDouble();
        System.out.printf("adding %.2f to account2 balance%n%n",
                depositAmount);
        account2.deposit(depositAmount);

        // displays the balances
        System.out.printf("%s balance: $%.2f %n",
                account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f %n%n",
                account2.getName(), account2.getBalance());
    }
}
