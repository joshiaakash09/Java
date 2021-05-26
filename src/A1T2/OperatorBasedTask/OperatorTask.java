package A1T2.OperatorBasedTask;

import java.util.Scanner;

public class OperatorTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose the following options: ");
        System.out.println("\n : Enter 1 for Addition"
                + "\n : Enter 2 for Subtraction"
                + "\n : Enter 3 for Division"
                + "\n : Enter 4 for Multiplication"
                + "\n : Enter 5 for Average");

        int input = sc.nextInt();
        int first, second;
        double result = 0;

        System.out.println("/n Enter two number to perform action" + input + " :");
        first = sc.nextInt();
        second = sc.nextInt();


        if (input == 1){
            result = (first + second);
            System.out.println("Addition of " + first + " and" + second + " is " + result);
        }
        else if(input == 2){
            result = (first - second);
            System.out.println("The subtraction of " + first + " and " + second +
                    " is: " + result);
        }
        else if(input == 3){
            result = (first/ second);
            System.out.println("The Division of " + first + " and " + second +
                    " is: " + result);
        }
        else if(input == 4){
            result = (first* second);
            System.out.println("The Multiplication of " + first + " and " + second +
                    " is: " + result);
        }
        else if(input == 5){
            result = (first + second)/2;
            System.out.println("The Average of " + first + " and " + second +
                    " is: " + result);
        }

        if(result < 0){
            System.out.println("Oops option " + input + " is returning the negative number ");
        }


    }
}
