package ch04.ex04_33;

public class InfinityLoop {

    public static void main(String[] args) {
        int i;

        i = 0;
        while (true) {
            int res;

            res = (int)Math.pow(2, i++);
            System.out.println(res);
        }
    }
}
