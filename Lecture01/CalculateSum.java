package Lecture01;

import java.util.Scanner;
public class CalculateSum {
    public static void main(String[] args) {
        //Write a program allowing user to enter 2 integers which are the amount of Upan's and Ipan's candy, respectively.
        //Then calculate and print out the total candy of Upan and Ipan on the screen.

        Scanner input = new Scanner(System.in);

        long a,b,c;

        a = input.nextLong();
        b = input.nextLong();
        c=a+b;

        System.out.println(a+" + "+b+" = "+c);
    }
}
