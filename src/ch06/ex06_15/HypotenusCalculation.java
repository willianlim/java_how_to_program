package ch06.ex06_15;

public class HypotenusCalculation {

    public static void main(String[] args) {
        System.out.printf("Triangle 1: %nSide1 = 3.0; Side2 = 4.0; hypotenuse = %f%n",
                hypotenuse(3.0, 4.0));
        System.out.printf("Triangle 2: %nSide1 = 5.0; Side2 = 12.0; hypotenuse = %f%n",
                hypotenuse(5.0, 12.0));
        System.out.printf("Triangle 3: %nSide1 = 8.0; Side2 = 15.0; hypotenuse = %f%n",
                hypotenuse(8.0, 15.0));
    }

    public static double hypotenuse(double side1, double side2) {
        return (Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2)));
    }
}
