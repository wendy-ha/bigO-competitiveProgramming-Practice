package Lecture09;

import java.util.Scanner;

public class SumOfEven {
    static void SumOfEven(int arr[], int i, int sum) {
        // If current index is invalid i.e. all
        // the elements of the array
        // have been traversed
        if (i < 0) {
            // Print the sum
            System.out.print(sum);
            return;
        }
        // If current element is even
        if ((arr[i]) % 2 == 0) {
            // Add it to the sum
            sum += (arr[i]);
        }

        // Recursive call for the next element
        SumOfEven(arr, i - 1, sum);
    }

    // Driver code
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
        int sum = 0;

        SumOfEven(arr, n - 1, sum);
    }
}

