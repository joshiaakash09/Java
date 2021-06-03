package AT3;

import java.util.Scanner;

public class TaskThreeDaysAndMonths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to know days in a month");
        int num = sc.nextInt();

           if (num == 1){
               System.out.println(" Jan has 31 days. ");
           } else if (num ==2){
               System.out.println(" Feb has 29 days. ");
           } else if (num==3){
               System.out.println("March has 31 days.");
           } else if (num==4){
               System.out.println("April has 30 days.");
           }else if (num==5){
               System.out.println("May has 31 days.");
           } else if (num==6){
               System.out.println("June has 30 days");
           }else if (num==7){
               System.out.println("July has 31 days");
           }else if (num==8){
               System.out.println("August has 31 days.");
           }else if (num==9){
               System.out.println("September has 30 days.");
           }else if (num==10){
               System.out.println("October has 31 days.");
           }else if (num==11){
               System.out.println("November has 30 days.");
           } else if (num==12){
               System.out.println("December has 31 days.");
           } else{
               System.out.println("Invalid input. Enter number between 1 to 12.");
           }
       }
    }

