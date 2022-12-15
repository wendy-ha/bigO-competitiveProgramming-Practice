package Lecture02;

import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();

        if (a>=b){
            System.out.print(a);
        }
        else System.out.print(b);
    }
}
