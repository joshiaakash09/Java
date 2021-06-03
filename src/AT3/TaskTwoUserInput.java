package AT3;

import java.util.Scanner;

public class TaskTwoUserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values: ");

        int a = 0;
        int b = 0;

        for( int i =0; i<10; i++){
           a += sc.nextInt();
           b += sc.nextInt();

        }
        System.out.println("Total Sum of numbers: " + a);
        System.out.println("Total Average of numbers : " + b/10);
    }
}
