package Week_Two.JavaBasics;
import java.util.Scanner;

//Write a program to check if a given number is odd or even.

public class OddOrEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");

        int number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.println("Even Number");
        }else{
            System.out.println("Odd number");
        }
    }
}
