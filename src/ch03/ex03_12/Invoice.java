/*
 * (Class Invoice) Create a class called Invoice for a computer supply store
 *  to use to represent a invoice for an item sold on it. An Invoice must include
 *  four pieces of information as instance variables — the number (String type),
 *  the description (String type), the quantity purchased of an item (int type),
 *  and the price per item (double). Your class must have a constructor that
 * initializes the four instance variables. Provide a set and a get method for
 * each instance variable. Also, provide a method called getInvoiceAmount that
 * calculates the invoice amount (that is, multiplies the amount by the price per item)
 *  and then returns that value as a double. If the quantity is not positive,
 * it must be set to 0. If the price per item is not positive, it must be set
 * to 0.0. Write a test application called InvoiceTest that demonstrates the
 * Invoice class capabilities.
 */
package ch03.ex03_12;

public class Invoice {

    private String number;
    private String description;
    private int quantity;
    private double pricePerItem;

    public Invoice(String number, String description, int quantity, double pricePerItem) {
        this.number = number;
        this.description = description;

        if (quantity > 0)
            this.quantity = quantity;
        else
            this.quantity = 0;

        if (pricePerItem > 0.0)
            this.pricePerItem = pricePerItem;
        else
            this.pricePerItem = 0.0;
    }

    public double getInvoiceAmount() {
        return (quantity * pricePerItem);
    }

    public String getNumber() {
        return (number);
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDescription() {
        return (description);
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return (quantity);
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPricePerItem() {
        return (quantity);
    }

    public void setPricePerItem(double pricePerItem) {
        if (pricePerItem > 0.0)
            this.pricePerItem = pricePerItem;
    }
}
