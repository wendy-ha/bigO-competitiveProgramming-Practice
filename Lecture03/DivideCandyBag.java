package Lecture03;
import java.util.Scanner;
public class DivideCandyBag {

    public static void main(String args[]) {
        // gia su ban dau moi bich keo deu co the chia deu, co hieu flag = true
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        // declare number of candy bag
        int n;
        n=Integer.parseInt(sc.nextLine());
        for(int i=1; i<=n; i++) {
            // declare number of candy in each bag
            int input = sc.nextInt();
            if (input % 2 !=0) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.print("YES");
        }
        else System.out.print("NO");

    }
}
