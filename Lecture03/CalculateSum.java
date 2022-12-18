package Lecture03;

import java.util.Scanner;

public class CalculateSum {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        long sum = 0;
        for (int i = 1;i <= n;i++) {
            sum = sum+i;
        }
        System.out.print(sum);
    }
}

