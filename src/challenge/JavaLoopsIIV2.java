package challenge;

import java.util.Scanner;

public class JavaLoopsIIV2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int t = in.nextInt();
        int expression = 0;

        if (t >= 0 && t <= 500) {
            for (int i=0; i < t; i++) {
                int a = in.nextInt();
                int b = in.nextInt();
                int n = in.nextInt();

                if (n >=1 && n <= 15) {
                    for (int j = 0; j < n; j++) {
                        if (a >= 0 && a <= 50 && b >= 0 && b <=50) {
                            expression = (int) (Math.pow(2, j) * b) + expression;
                            System.out.print(a + expression + " ");
                        }
                    }
                    System.out.println();
                    expression = 0;
                }
            }
        }
        in.close();
    }
}
