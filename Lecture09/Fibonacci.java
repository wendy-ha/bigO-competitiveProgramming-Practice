package Lecture09;

import java.util.Scanner;

public class Fibonacci {
    static int fibonacci(int n) {

        if (n == 0 || n ==1) {
            return 1;
        }
        return fibonacci(n-1)+fibonacci(n-2);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        System.out.print(fibonacci(input));
    }
}
