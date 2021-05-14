package SwapTwoWithoutThird;

import java.util.Scanner;

public class SwapWithoutThird {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers to swap");

        int a = sc.nextInt();
        int b = sc.nextInt();

        b=(a+b)-(a=b);
        System.out.println("Numbers after swapping");
        System.out.println("First variable:" + a);
        System.out.println("Second variable:" + b);
    }
}
