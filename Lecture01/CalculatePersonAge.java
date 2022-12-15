package Lecture01;

import java.util.Scanner;
public class CalculatePersonAge {
    public static void main(String[] args) {
        //A single integer is year of birth of a person (the year of birth is A.D. and is a positive number less than 2019).

        Scanner input = new Scanner(System.in);
        int birthYear, currentYear, personAge;
        currentYear = 2019;
        birthYear = input.nextInt();
        if (birthYear > 0 & birthYear < 2019) {
            personAge = currentYear - birthYear;
            System.out.println(personAge);
        }

    }
}
