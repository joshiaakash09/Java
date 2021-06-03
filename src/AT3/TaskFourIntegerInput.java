package AT3;

import java.util.Scanner;

public class TaskFourIntegerInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a value: ");
        int i, num = 0, sum = 0;

        num = sc.nextInt();

        for(i = 0; i <= num; ++i)

        {
            sum = sum + i;
        }

        System.out.println("The sum is:"+ sum);
    }

}
