package ch04.ex04_32;

public class CheckerBoard {

    public static void main(String[] args) {
        int i;
        int j;

        i = 0;
        while (++i <= 8) {
            j = 0;
            while (++j <= 8) {
                System.out.print("* ");
            }
            System.out.println();
            if (i % 2 == 1)
                System.out.print(" ");
        }
    }
}
