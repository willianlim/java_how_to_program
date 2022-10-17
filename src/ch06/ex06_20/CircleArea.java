package ch06.ex06_20;

import java.util.Scanner;

public class CircleArea {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the value of the radius of the circle: ");
        double radius = input.nextDouble();
        input.close();

        System.out.printf("Circumference area: %f%n", circleArea(radius));
    }

    public static double circleArea(double radius) {
        return (Math.PI * Math.pow(radius, 2));
    }
}
