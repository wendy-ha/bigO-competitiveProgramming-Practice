package Lecture02;

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();//electricity index last month
        int b = input.nextInt();//electricity index this month
        int c = b-a;
        int usedElectricity;
        double VAT = 0.1;
        long moneyPaid = 0;

        if (((a>=0)&&(b>0))&&(a<b)){
            if (c<51){
                usedElectricity = c*1484;
            } else if (c<101) {
                usedElectricity = 50*1484+(c-50)*1533;
            } else if (c<201) {
                usedElectricity = 50*1484+50*1533+(c-100)*1786;
            } else if (c<301) {
                usedElectricity = 50*1484+50*1533+100*1786+(c-200)*2242;
            } else if (c<401) {
                usedElectricity = 50*1484+50*1533+100*1786+100*2242+(c-300)*2503;
            } else {
                usedElectricity = 50*1484+50*1533+100*1786+100*2242+100*2503+(c-400)*2587;
            }
            moneyPaid = (long) (usedElectricity + (usedElectricity*VAT));
            System.out.println(moneyPaid);
        }
    }
}
