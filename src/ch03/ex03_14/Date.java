/*
 * 3.14 (class Date) Create a class called Date that includes three instance
 * variable - moth (type int), day (type int), and year (type int). Provide
 * a constructor tha initializes the three instance variables assuming the
 * values provided. Introduce a displayDate method that display moth, day
 * and year separated by forward slashes (/). Write a test application
 * called DateTest that demonstrates the capabilities of the Date class.
 */
package ch03.ex03_14;

public class Date {

    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return (day);
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return (month);
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return (year);
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void displayDate() {
        String date;
        date = month + "/" + day + "/" + year;
        System.out.println(date);
    }
}
