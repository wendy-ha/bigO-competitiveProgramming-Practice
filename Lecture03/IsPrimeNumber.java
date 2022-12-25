package Lecture03;

import java.util.Scanner;

public class IsPrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input;
        input = scanner.nextInt();
        boolean flag = true;
        if (input <2){
            flag = false;
        }
        for (int i=2;i <input; i++){
            if (input % i == 0) {
                flag = false;
                break;
            }
        }
        // note: boolean flag = true and flag also means true
        if (flag) {
            System.out.print("YES");
        }
        else System.out.print("NO");

    }
}
