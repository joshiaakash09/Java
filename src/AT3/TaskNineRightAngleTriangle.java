package AT3;

import java.util.Scanner;

public class TaskNineRightAngleTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Provide input: ");

        int input = sc.nextInt();

        for (int a=1; a<=input; a++){
            for (int b=1; b <=a; b++){
                System.out.println(b);
                System.out.println("");
            }

        }

    }
}
