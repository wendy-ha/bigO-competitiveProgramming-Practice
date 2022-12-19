package Lecture03;

import java.util.Scanner;

public class CalculateStar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input;
        int count = 0;

        while(true){
            input = scanner.nextInt();
            if (input == 5) {
                count = count +1;
            }
            if(input ==0){
                break;
            }
        }
        System.out.print(count);

    }
}
