package AT3;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class TaskSixThreeInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter first input");
        a = sc.nextInt();
        System.out.println("Enter second input");
        b=sc.nextInt();
        System.out.println("Enter third input");
        c=sc.nextInt();

        if (a<b && b<c){
            System.out.println("Increasing");
        } else if (a>b && b>c){
            System.out.println("Decreasing");
        } else {
            System.out.println("Neither increasing nor decreasing");
        }
    }
}
