package Lecture02;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        if (year >=1000 && year <=9000)
            if (((year % 4 == 0) && (year % 100 !=0)) || (year % 400 ==0)) {
                System.out.println("YES");
            } else  System.out.println("NO");
    }
}
