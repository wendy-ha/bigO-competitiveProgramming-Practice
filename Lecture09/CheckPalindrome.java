package Lecture09;

import java.util.Scanner;

public class CheckPalindrome {
    static void palindrome (String n, int length, String reverseString) {
        if (length<=0) {
            if (n.equals(reverseString)) {
                System.out.println("YES");
                return;
            }
            else {
                System.out.println("NO");
                return;
            }
        }
        else {
            reverseString = reverseString + n.charAt(length-1);
        }
        palindrome (n, length-1, reverseString);

    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int strLength = sc.nextInt();
        sc.nextLine();
        String strInput = sc.nextLine();
        if(strInput.length()>strLength)
        {
            strInput = strInput.substring(0, strLength);
        }
        String reverseString="";
        palindrome(strInput, strLength, reverseString);
    }
}

/*----SOLUTION2-----*/
//public static void main(String[] args) {
//    String chuoi;
//    char kyTu;
//    Scanner scanner = new Scanner(System.in);
//
//    System.out.println("Nhập vào chuỗi bất kỳ: ");
//    chuoi = scanner.nextLine();
//
//    for (int i = 0; i < chuoi.length(); i++) {
//        kyTu = chuoi.charAt(chuoi.length() - i - 1);
//
//        // kiểm tra ký tự tại vị trí i
//        // có giống với ký tự tại vị trí (chuoi.length() - i - 1) hay không
//        if (chuoi.charAt(i) == kyTu) {
//            System.out.println("Chuỗi này là chuỗi Panlyndrome.");
//            break;
//        } else {
//            System.out.println("Chuỗi này không là chuỗi Panlyndrome.");
//            break;
//        }
//    }
//}
