package Lecture09;

import java.util.Scanner;

public class FindFirstDigit {
    static int firstDigit(int n) {
        if (n <=-10) {
            return firstDigit(n/10);
        }
        else if (n <0) {
            return -n;
        }
        else if (n<10) {
            return n;
        }
        return firstDigit(n/10);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        System.out.print(firstDigit(input));
    }
}
