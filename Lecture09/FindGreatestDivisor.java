package Lecture09;

import java.util.Scanner;

public class FindGreatestDivisor {
    //Vào thế kỷ 3 TCN, nhà toán học Euclid (phiên âm tiếng Việt là Ơ-clit) đã phát minh ra một giải thuật tìm USCLN
    // của hai số nguyên dương rất hiệu quả được gọi là giải thuật Euclid.
    // Cụ thể về ý tưởng của bài toán, giả sử a lớn hơn b, khi đó việc tính UCSLN của a và b sẽ được đưa về bài toán tính USCLN của a mod b và b vì USCLN(a, b) = USCLN(a mod b, b)
    static int EuclidGreatestDivisor(int a, int b) {

        if (b == 0) {
            return a;
        }
        return EuclidGreatestDivisor(b, a%b);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.print(EuclidGreatestDivisor(a, b));
    }

    /*SOLUTION 2*/
//    public static void main(String[] args) {
//        int num1, num2;
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Nhập số thứ nhất:");
//        num1 = (int)scanner.nextInt();
//        System.out.print("Nhập số thứ hai:");
//        num2 = (int)scanner.nextInt();
//        scanner.close();
//        while (num1 != num2) {
//            if(num1 > num2)
//                num1 = num1 - num2;
//            else
//                num2 = num2 - num1;
//        }
//        System.out.printf("Ước chung lớn nhất là: %d", num2);
//    }

    /*SOLUTION 3*/
//    public static void main(String[] args) {
//        int num1 = 55, num2 = 121, gcd = 1;
//        for(int i = 1; i <= num1 && i <= num2; i++)
//        {
//            if(num1%i==0 && num2%i==0)
//                gcd = i;
//        }
//        System.out.printf("Ước chung lớn nhất của %d và %d là: %d", num1, num2, gcd);
//    }
}
