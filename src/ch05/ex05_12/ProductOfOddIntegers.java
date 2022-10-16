package ch05.ex05_12;

public class ProductOfOddIntegers {
    public static void main(String[] args) {
        int i;
        int prod;

        i = 0;
        prod = 1;
        while (++i <= 15) {
            if (i % 2 != 0) {
                prod *= i;
            }
        }
        System.out.printf("The result is: %d", prod);
    }
}
