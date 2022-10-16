package ch05.ex05_20;

public class ValueOfPI {

    public static void main(String[] args) {
        double pi = 0;
        double oddNumber = 1;

        for (int i = 0; i < 2000000; i++) {
            if (i % 2 == 0)
                pi += 4 / oddNumber;
            else
                pi -= 4 / oddNumber;
            oddNumber += 2;
        }
        System.out.printf("PI = %f", pi);
    }
}
