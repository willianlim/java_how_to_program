package ch05.ex05_13;

public class Factorials {
    public static void main(String[] args) {
        int i;
        int j;
        long prod;

        i = 0;
        prod = 1;
        while (++i <= 20) {
            j = i;
            prod = i;
            while (--j > 0) {
                prod *= j;
            }
            System.out.printf("%d%n", prod);
        }
    }
}
