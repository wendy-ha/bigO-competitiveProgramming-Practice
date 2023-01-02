package Lecture09;

import java.util.Scanner;

public class ConvertBinaryNumber {
    /*
     * Chia lien tuc cho 2 va lay phan du
     * Dao nguoc chuoi phan du tu duoi len => Ket qua
     * 10:2 = 5  du 0
     * 5:2 = 2 du 1
     * 2:2 = 1 du 0
     * 1:2 = 0 du 1
     * 0
     * 10
     * 010
     * 1010
     */
    static void ConvertBinary(int a, String binary) {
        if (a==0) {
            System.out.print(binary);
            return;
        }
        else {
            binary = (a % 2) + binary;

        }
        ConvertBinary(a/2, binary);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        String binary = "";
        if (input==0) {
            System.out.print("0");
        }
        ConvertBinary(input, binary);
    }
}
