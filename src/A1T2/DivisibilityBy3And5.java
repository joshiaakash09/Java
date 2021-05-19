package A1T2;

import java.util.Scanner;

public class DivisibilityBy3And5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int i = sc.nextInt();
        if( i % 3 == 0 && i % 5 == 0){
            System.out.println("Number is divisible by both 3 and 5");
        } else if (i % 5 == 0){
            System.out.println("Number is divisible by 5");
        } else if (i % 3 == 0 ){
            System.out.println("Number is divisible by 3");
        } else {
            System.out.println("Not divisible ");
        }

    }
}
