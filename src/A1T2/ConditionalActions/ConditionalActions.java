package A1T2.ConditionalActions;

import java.util.Scanner;

public class ConditionalActions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer value:");

        int value = sc.nextInt();

        if (value % 2 != 0) {
            System.out.println("Number is odd");
        } else if (value % 2 == 0 && value >= 2 && value <= 5) {
            System.out.println("Number is Even");
        } else if (value % 2 == 0 && value >= 6 && value <= 30) {
            System.out.println("Number is Even");
        } else if (value % 2 == 0 && value > 30) {
            System.out.println("Number is greater than 30 and even");
        }
    }
}
