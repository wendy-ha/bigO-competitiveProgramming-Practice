package Lecture01;

import java.util.Scanner;
import java.lang.Math;

public class CalculateTriangleArea {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double a,b,c, P, p, S;

        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();

        P = a+b+c;
        p = P/2;
        S = Math.sqrt(p*(p-a)*(p-b)*(p-c));

        if (a+b>c && a+c>b && b+c>a) {
            System.out.printf("%.2f %.2f", P, S);
        }
    }
}