// package Day7NumberPattern;

import java.util.Scanner;

public class NumberPattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entern Pattern Number");
        // int n = sc.nextInt();
        int n = 3;

        for (int i = 1; i <= n; i++) {

            for (int sp = i; sp < n; sp++) {
                System.out.print("  ");
            }

            for (int num1 = i; num1 >= 1; num1--) {
                System.out.print(num1 + " ");
            }

            for (int num2 = 2; num2 <= i; num2++) {
                System.out.print(num2 + " ");
            }

            System.out.println();
        }

    }

}
