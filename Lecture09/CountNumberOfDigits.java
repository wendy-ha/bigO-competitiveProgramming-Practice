package Lecture09;

import java.util.Scanner;

public class CountNumberOfDigits {
    static int countDigit(long n) {
        if (n/10 == 0) {
            return 1;
        }
        return 1+countDigit(n/10);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long input = scanner.nextLong();
        System.out.print(countDigit(input));
    }
}
