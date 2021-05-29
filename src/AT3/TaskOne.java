/**
 * Write a simple program to print multiplication table of a certain number taken from user,
 *
 * For eg. 2 X 1 = 2
 * 2 X 2 = 4
 * and so on.
 */


package AT3;

import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input a number: ");
        int num = sc.nextInt();

        for (int i=0; i< 10; i++){
            System.out.println(num + " x " + (i+1) + " = " +
                    (num * (i+1)));
        }
    }

}
