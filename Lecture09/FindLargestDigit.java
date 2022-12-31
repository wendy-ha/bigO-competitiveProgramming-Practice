package Lecture09;

import java.util.Scanner;
import java.lang.Math;

public class FindLargestDigit {

    static int maxNumber(int n) {

        if (n == 0 ) {
            return 0;
        }
        //abs la ham lay tri tuyet doi cua 1 so. eg: |-18779| = 18779
        n = Math.abs(n);
        int max = 0;
        while (n > 0) {
            int temp = n % 10;
            n = n/10;
            if (temp > max)
                max = temp;
                //else max = maxNumber(n/10);
            }
        return max;
        }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        System.out.print(maxNumber(input));
    }

}
