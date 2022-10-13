/*
 * 2.32 (Body Mass Index Calculator) We introduced the body mass index
 * (BMI) calculator in Exercise 1.10. The formulas for calculating BMI are
 *
 *      BMI = (weightInPounds * 703) / (heightInInches * heightInInches)
 *          or
 *      BMI = weightInKilograms / (heightInMeters * heightInMeters)
 *
 * Create a BMI calculator that reads the user's wight in pounds and height
 * in inches (or, if you prefer, the user's weight in kilograms and height in
 * meters), then calculates and display the user's body mass index. Also,
 * display the BMI categories and their values from the National Heart Lung
 * and Blood Institute
 *
 *  BMI Categories:
 * Underweight: < 18.5
 * Normal: > 18.5 and < 24.9
 * Overweight: > 25 and < 29.9
 * Obese: >= 30
 *
 * [Note: In this chapter, you learned to use the int type to represent whole
 * numbers. The BMI calculations when done with int values will both
 * produce whole-numbers results. In Chapter 3 you'll learn to use the
 * double type to represent numbers with decimal points. When the BMI
 * calculations are performed with doubles, they'll both produce numbers
 * with decimal points-these are called "floating-point" numbers.]
 */
package ch02.ex02_33;

import java.util.Scanner;

public class BMI {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double weightInKilograms;
        double heightInMeters;
        double bmi;

        System.out.println("Enter you weight (in kilograms): ");
        weightInKilograms = input.nextDouble();

        System.out.println("Enter you height (in meters): ");
        heightInMeters = input.nextDouble();
        input.close();

        bmi = weightInKilograms / (heightInMeters * heightInMeters);

        System.out.printf("%n Your MBI is %,.2f%n%n", bmi);

        System.out.println("BMI Categories: \r\n" + "Underweight =< 18.5\r\n" + "Normal weigh = 18.5-24.9\r\n"
                + "Overweight = 25-29.9\r\n" + "Obesity = BMI of 30 or greater");

    }
}
