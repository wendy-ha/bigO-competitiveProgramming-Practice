package Lecture02;

import java.util.Scanner;

public class LuckyNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int x = input.nextInt();
        if (((a >=1)&&(a<=100000)) &&((b>=1)&&(b<=100000)) &&((x>=1)&&(x<=10000000))){
            if ((x%a==0) && (x%b==0)){
                System.out.println("Both");
            } else if ((x%a==0) && (x%b!=0)) {
                System.out.println("Upan");
            } else if ((x%a!=0) && (x%b==0)) {
                System.out.println("Ipan");
            } else System.out.println("No");
        }
    }
}
