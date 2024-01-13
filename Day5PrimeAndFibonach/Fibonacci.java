import java.util.Scanner;

public class Fibonacci {

    public static void fibonacci(int num) {
        int fist = 0, secont = 1;

        for (int i = 0; i < num; i++) {
            System.out.println("fib " + fist);
            int nextFib = fist + secont;
            fist = secont;
            secont = nextFib;
        }

    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter Num");
            int num = sc.nextInt();
            fibonacci(num);
        }
    }
}