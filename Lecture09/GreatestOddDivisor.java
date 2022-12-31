package Lecture09;

import java.util.Scanner;

public class GreatestOddDivisor {
    static int greatestOddDivisor(int n) {
        if (n % 2 !=0) {
            return n;
        }
        return greatestOddDivisor(n/2);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        System.out.print(greatestOddDivisor(input));
    }
}
