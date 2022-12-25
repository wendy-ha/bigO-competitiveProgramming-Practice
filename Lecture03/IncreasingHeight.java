package Lecture03;

import java.util.Scanner;

public class IncreasingHeight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input;
        // don't have any tree with height <=0
        int hprev = 0;
        boolean flag = true;
        while (true) {
            int hcur = scanner.nextInt();
            if(hcur == 0){
                break;
            }
            if(hcur < hprev){
                flag = false;
                break;
            }
            else hprev = hcur;

        }
        if (flag) {
            System.out.print("YES");
        }
        else System.out.print("NO");

    }
}
