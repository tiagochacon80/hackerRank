package introduction;

import java.util.Scanner;

public class JavaLoopsII {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();

        if (q < 0 || q > 500) {
            System.out.println("Number of interactions not allowed.");
        }
        else {

            int product = 0;
            int sum = 0;
            int c = 0;

            for (int i = 0; i < q; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                int n = sc.nextInt();

                if ((a < 0) || (a > 50) || (b < 0) || (b > 50) || (n < 1) || (n > 15)) {
                    break;
                }
                else {

                    c = 0;
                    for (c = 0; c < n; c++) {
                        product = product + ((int) Math.pow(2, c) * b);
                        sum = a + product;
                        System.out.printf("%d ", sum);

                        sum = 0;
                    }
                    System.out.printf("\n");
                    product = 0;
                }
            }
        }

        sc.close();
    }
}
