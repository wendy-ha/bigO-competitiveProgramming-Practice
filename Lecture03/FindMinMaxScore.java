package Lecture03;

import java.util.Scanner;

public class FindMinMaxScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input;
        int min = 11;
        int max = -1;

        while (true) {
            input = scanner.nextInt();
            if (input >= 0 && input <=10) {
                if ( input > max) {
                    max = input;
                }
                if (input <= min) {
                    min = input;
                }
                if(input ==-1){
                    break;
                }
            }
            else break;

        }
        System.out.printf("%d %d", max, min);

    }
}
