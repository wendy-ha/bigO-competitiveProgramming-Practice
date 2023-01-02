package Lecture09;

import java.util.Scanner;

public class FindFirstPrimeNumber {

    static void FirstPrime(int arr[], int i) {
        boolean flag = true;
        int j;
        for (j = 0; j <= i; j++) {
            if (arr[j] < 2) {
                flag = false;
            } else if (arr[j] == 2) {
                flag = true;
            } else {
                for (int n = 2; n < (arr[j]); n++) {
                    if (arr[j] % n == 0) {
                        flag = false;
                        break;
                    }
                    flag = true;
                }
            }
        }
        if (!flag) {
            System.out.print(-1);
        } System.out.print(arr[j]);
    }


//        for (j = 2; j < (arr[i] / 2); j++) {
//            if (arr[i] % j == 0) {
//                flag = false;
//                break;
//            } else return arr[i];
//        }
//        if (flag) {
//            return arr[i];
//        }
        //FirstPrime(arr, i - 1);


    public static void main (String[] args)
    //throws java.lang.Exception
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        //store arrLength numbers into the array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
            //System.out.print(arr[i]);
        }
        //boolean flag = false;

        //FirstPrime(arr, n - 1);
    }
}
