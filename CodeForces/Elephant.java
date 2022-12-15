package CodeForces;

import java.util.Scanner;

//An elephant decided to visit his friend. It turned out that the elephant's house is located at point 0 and his friend's house is located at point x(x > 0) of the coordinate line. In one step the elephant can move 1, 2, 3, 4 or 5 positions forward. Determine, what is the minimum number of steps he need to make in order to get to his friend's house.
//
//        Input
//        The first line of the input contains an integer x (1<=x<=1000000) — The coordinate of the friend's house.
//
//        Output
//        Print the minimum number of steps that elephant needs to make to get from point 0 to point x.
//

public class Elephant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();//The coordinate of the friend's house
        int b = 0; //number of steps

        if (a>=1 && a<=1000000) {
            if (a<=5){
                b = 1;
            }
            else {
                if (a % 5 ==0) {
                    b = a/5;
                }
                else b = a/5+1;
            }
            System.out.println(b);
        }

    }
}
