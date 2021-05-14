package UserInput;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your First Name");
        String Name = sc.next();
        System.out.println("Please enter your Age");
        int age = sc.nextInt();

        System.out.println("Welcome, " + Name + ". You are " + age + " years old.");

    }
}
