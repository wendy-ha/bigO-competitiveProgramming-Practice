package Lecture02;

import java.util.Scanner;

public class MaxCandy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[4];
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++)
        {
            numbers[i] = input.nextInt();
        }
        for (int j = 0; j < numbers.length; j++ )
        {
            if (numbers[j] >0) {
                if (numbers[j]>=max){
                    max=numbers[j];
                }
            }
        }

        System.out.println(max);

    }
}
