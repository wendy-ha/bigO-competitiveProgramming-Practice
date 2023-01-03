package Lecture09;
import java.util.Scanner;
public class ConvertHexadecimal {
    static void hex(int num) {
        if(num>=0 && num<10)
            System.out.print(num);
        else if(num>=10 && num<=15)
        {
            switch(num)
            {
                case 10:
                    System.out.print('A');
                    break;
                case 11:
                    System.out.print('B');
                    break;
                case 12:
                    System.out.print('C');
                    break;
                case 13:
                    System.out.print('D');
                    break;
                case 14:
                    System.out.print('E');
                    break;
                case 15:
                    System.out.print('F');
                    break;

            }
        }
        else
        {
            hex(num / 16);
            hex(num%16);
            return;
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        hex(num);
    }
}
