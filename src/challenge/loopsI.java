package challenge;

import java.util.Scanner;

public class loopsI {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        if ((N < 2) || (N > 20)) {
            System.out.println("Wrong input!");
        }
        else {
            int product = 0;
            for (int i = 0; i <= 10; i++) {
                product = N * i;
                System.out.println(N + " x " + i + " = " + product);
            }
        }
        sc.close();
    }
}
