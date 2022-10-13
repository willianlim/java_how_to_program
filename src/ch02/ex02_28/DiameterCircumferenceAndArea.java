/*
 * 2.28 (Diameter, circumference and area of a circle) Here's a preview of what
 * we'll see later. In this chapter, you learned about integers and type int.
 * Java can also represent floating pont numbers that contain decimal fraction
 * points, such as 3.14159. Write an application that reads input from the user
 * of the radius of a circle as an integer and prints the diameter of the circle,
 * circumference and are using the floating point value 3.14159 for S.
 * Use the techniques shown in Figure 2.7. [Note: you it can also employ the
 * predefined constant Math.PI for the value of S. This constant is more accurate
 * than the value 3.14159. The class Math is defined in the java.lang package.
 * Classes in this package are imported automatically, so you don1t need ot import
 * the Math class to use it.] Adopt the following formulas (r is the radius):
 *
 * diameter = 2r
 * circumference = 2Sr
 * area = Sr2
 *
 * Do not store teh results of each calculation in a variable. Instead,
 * specify each calculation as the output value in a System.out.printf
 * statement. The values produced by circumference and area calculation are
 * floating point number. The exit of these values can the generated with
 * the specific.
 */
package ch02.ex02_28;

import java.util.Scanner;

public class DiameterCircumferenceAndArea {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of a circle: ");
        int radius = input.nextInt();
        input.close();

        System.out.printf("Diameter is : %d%n", radius * 2);
        System.out.printf("Circumference is : %f%n", 2 * Math.PI * radius);
        System.out.printf("Area is : %f%n", Math.PI * (radius * radius));
    }
}
