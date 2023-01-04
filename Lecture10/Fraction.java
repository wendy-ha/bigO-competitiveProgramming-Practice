package Lecture10;

import java.util.Scanner;

public class Fraction {
    int num;
    int denom;

    public Fraction(int num, int denom) {
        this.num = num;
        this.denom = denom;
    }

    public Fraction() {

    }

    public Fraction sumFraction(Fraction p2) {
        Fraction p3 = new Fraction();
        p3.num = this.num*p2.denom + this.denom*p2.num;
        p3.denom = this.denom*p2.denom;
        p3.reductionFraction();
        return p3;
    }

    public void reductionFraction() {
        if (this.num == 0) {
            this.denom = 1;
            return;
        }

        int x = gcd(Math.abs(this.num),Math.abs(this.denom));
        this.num = this.num/x;
        this.denom = this.denom/x;

    }


    public int gcd(int a, int b) {
        int r = 0;
        while (b != 0) {
            r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    @Override
    public String toString() {
        String s = String.format("%d %d", this.num, this.denom);
        return s;
    }

    public static void main(String []args) {
        Fraction p1;
        Fraction p2;
        Fraction p3;

        int x, y;

        Scanner sc = new Scanner(System.in);
        x =sc.nextInt();
        y=sc.nextInt();
        p1 = new Fraction(x, y);

        x = sc.nextInt();
        y = sc.nextInt();
        p2 = new Fraction(x, y);

        p3 = p1.sumFraction(p2);
        System.out.println(p3.toString());

    }
}


