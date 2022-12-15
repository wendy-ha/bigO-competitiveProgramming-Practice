package Lecture02;

import java.util.Scanner;

public class FindQuarterOfYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int month = input.nextInt();
        int quarter;

        if (month >0 && month <=12)
            if (month < 4) {
                System.out.print(quarter=1);
            } else if (month <7) {
                System.out.print(quarter=2);
            } else if (month<10) {
                System.out.print(quarter=3);
            }
            else System.out.print(quarter=4);
    }
}
