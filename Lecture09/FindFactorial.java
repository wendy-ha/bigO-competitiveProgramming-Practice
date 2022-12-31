package Lecture09;

import java.util.Scanner;

public class FindFactorial {
    static int factorial(int n) {
        if (n<=0) {
            return 1;
        }
        return n*factorial(n-1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        System.out.print(factorial(input));

    }
}
