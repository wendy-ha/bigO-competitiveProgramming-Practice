package Lecture02;

import java.util.Scanner;

public class FindSimilarSign {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        float a,b;

        a = input.nextFloat();
        b = input.nextFloat();
        if (((a > 0) && (b>0)) || ((a < 0) && (b<0))) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
