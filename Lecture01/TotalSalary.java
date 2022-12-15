package Lecture01;

import java.util.Scanner;

public class TotalSalary {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a = input.nextInt();//basic salary
        double b = input.nextDouble();//coefficients salary
        int c = input.nextInt();// allowance
        double d = a*b+c;//Salary

        if (a>0 && b>=0.0 && c>=0) {
            System.out.printf("%.2f %.2f", d);
        }
    }
}
