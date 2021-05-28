package A1T2.BreakContinue;

import java.util.Scanner;

public class BreakAndContinue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any positive number to run the program");

        int a = sc.nextInt();

        if (a>=0){
            System.out.println("You entered the number:" + a + " Good going.");
        } else {
            System.out.println("You have entered a negative number. it's over");
        }
    }
}
