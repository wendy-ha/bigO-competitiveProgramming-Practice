package Lecture01;

import java.util.Scanner;
public class AreaOfCircle {
    public static void main(String[] args) {
        //Give the radius of a circle, calculate its circumference and area.
        Scanner input = new Scanner(System.in);
        double radius = input.nextDouble();
        double circumferenceOfCircle, areaOfCircle;

        //declare constant variable
        final double PI = 3.14;

        circumferenceOfCircle = 2 * radius * PI;
        areaOfCircle = radius * radius * PI;

        //The result must be printed with 2 digits after the decimal point.
        if (radius > 0 & radius < 2000) {
            System.out.printf("%.2f \n", circumferenceOfCircle);
            System.out.printf("%.2f", areaOfCircle);
        }

    }
}