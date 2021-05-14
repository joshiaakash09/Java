package SwapTwoNumbers;

import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        int a, b, temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Variables");

        a=sc.nextInt();
        b=sc.nextInt();

        temp = a;
        a = b;
        b = temp;

        System.out.println("Value of first varibale: " +a);
        System.out.println("Value of second varibale: " +b);
    }
}
