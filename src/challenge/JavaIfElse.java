package challenge;

import java.util.Scanner;

public class JavaIfElse {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int N = sc.nextInt();
        sc.skip("(\\r\\n|[\\n\\r\\u2028\\u2029\\u0085])?");

        sc.close();

        if ((N < 1) || (N > 100)) {
            System.out.println("Out of range!");
        }
        else {
            if (N % 2 != 0) {
                System.out.println("Weird");
            }
            else {
                if ((N % 2 == 0) && (N >= 2) && (N <= 5)) {
                    System.out.println("Not weird");
                }
                if ((N % 2 == 0) && (N >= 6) && (N <= 20)) {
                    System.out.println("Weird");
                }
                if ((N % 2 == 0) && (N > 20)) {
                    System.out.println("Not weird");
                }
            }
        }
    }
}
