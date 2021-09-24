package Week_Two.JavaBasics;

//1 Write a program to check if a given number is Positive, Negative, or Zero.

import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args) {

        //using Scanner class to get user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check");
         int num = sc.nextInt();

         if (num < 0){
             System.out.println(num + " is negative number");
         }else if (num >0){
             System.out.println(num + " is positive number");
         }else{
             System.out.println(num + " number is not positive or negative");
         }
    }
}
