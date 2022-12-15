package Lecture01;

import java.util.Scanner;
public class CalculateGrade {
    public static void main(String[] args) {
        //AWrite a program to enter test grades of 3 tests: Math, Natural Science and English.
        // Calculate the total grades of 3 tests of that student.
        // Input:
//        The first line contains the grade of Math.
//        The second line contains the grade of Natual Science.
//        The third line contains the grade of English. Knowing that the input grade is a real number between 0.0 and 10.0.
        // Output:
//        A single line contains the result. Note: The result must be printed with 2 digits after the decimal point.

        double math, naturalScience, english, totalGrade;
        Scanner input = new Scanner(System.in);

        math = input.nextDouble();
        naturalScience = input.nextDouble();
        english = input.nextDouble();
        totalGrade = math+naturalScience+english;
        //The result must be printed with 2 digits after the decimal point.
        System.out.printf("%.2f", totalGrade);

    }
}