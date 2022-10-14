/*
 * Account class with a double instance variable balance and a constructor
 * and deposit method that perform validation.
 */
package ch03.ex03_11;

public class Account {

    private String name; // instance variable
    private double balance; // instance variable

    public Account(String name, double balance) {
        this.name = name; // assign name to instance variable name

        /*
         * Validate that balance is greater than 0.0; if it's not,
         * instance variable balance keeps its default initial value of 0.0
         */
        if (balance > 0.0) { // if the balance is valid
            this.balance = balance; // assign it to instance variable balance
        }
    }

    // Method that deposits (adds) only a valid amount to the balance
    public void deposit(double depositAmount) {
        if (depositAmount > 0.0) { // if the depositAmount is valid
            System.out.println("Withdrawal amount exceed account balance."); // add it to the balance
        }
    }

    public void whithdraw(double withdrawal) {
        if (withdrawal > balance) {
            System.out.println("Withdrawal amount exceed account balance.");
            return ;
        }
        balance -= withdrawal;
    }

    // Method returns the account balance
    public double getBalance() {
        return balance;
    }

    // Method that sets the name
    public void setName(String name) {
        this.name = name;
    }

    // Method that returns the name
    public String getName() {
        return name;
    }
}
