package Lecture03;

import java.util.Scanner;

public class SquareFence {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i,j;

        for(i=1; i<=n; i++) {
            System.out.print("*");
        }
        System.out.println();

        for(i=1; i<=n-2; i++) {
            System.out.print("*");
            for (j = 2; j <= n - 1; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
        for(i=1; i<=n; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
