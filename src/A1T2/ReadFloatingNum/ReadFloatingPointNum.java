package A1T2.ReadFloatingNum;

import java.util.Scanner;

public class ReadFloatingPointNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        float num = sc.nextFloat();
        float AbsVal = sc.nextFloat();

        if (num == 0){
            System.out.println("Zero");
        } else if (num < 0){
            System.out.println("Negative number");
        } else if (num > 0){
            System.out.println("Positive number");
        }

        if (AbsVal <1){
            System.out.println("Small");
        } else if (AbsVal > 1000000){
            System.out.println("Large");
        }
    }
}
