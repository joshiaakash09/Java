package UserInput;

import java.util.Scanner;

public class InputOneToTen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any 2 numbers in between 1 and 10");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int z = 0;

        if((a >= 1 && a <=10) && (b >= 1 && b <= 10)){
             z = a + b + 30;
        } else {
            System.out.println("Enter value is not in limit");
        }

        System.out.println("Final value is : " + z);

    }
}
