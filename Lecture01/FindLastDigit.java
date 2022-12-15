package Lecture01;

import java.util.Scanner;
public class FindLastDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int sum = 0;
        if (num >= 10000 & num <=99999) {
            while (num > 0) {
                //Find the last digit of the number (N) using the modulo (%) operator
                sum = sum + num % 10;
                //Divide the number (N) by 10. It removes the last digit of the number.
                num = num / 10;
            }
        }
        int lastDigitOfSum = sum % 10;
        System.out.println(lastDigitOfSum);
    }
}
