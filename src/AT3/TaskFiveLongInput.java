package AT3;

import java.util.Scanner;

public class TaskFiveLongInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter long type input");
        long a;
        int sum =0;
         a = sc.nextLong();
        System.out.println(a);

        while (a != 0) {
            sum = sum + (int)a % 10;
            a = a / 10;
        }
        System.out.println("Sum= " + sum);
    }
}
