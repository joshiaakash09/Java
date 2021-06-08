package AT3;

import java.time.Month;
import java.util.Scanner;

public class TaskSevenDaysInMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number for month");
        int month = sc.nextInt();
        System.out.println("Enter a year");
        int year = sc.nextInt();

        int DaysInMonth = 0;
        String MonthName = "Invalid";

        switch (month){
            case 1:
                MonthName = "January";
                DaysInMonth = 31;
                break;
            case 2:
                MonthName = "February";
                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))){
                    DaysInMonth = 29;}
                    else{
                        DaysInMonth = 28;
                    }
                    break;
            case 3:
                MonthName = "Marcch";
                DaysInMonth = 31;
                break;
            case 4:
                MonthName = "April";
                DaysInMonth = 30;
                break;
            case 5:
                MonthName = "May";
                DaysInMonth = 31;
                break;
            case 6:
                MonthName = "June";
                DaysInMonth = 30;
                break;
            case 7:
                MonthName = "July";
                DaysInMonth = 31;
                break;
            case 8:
                MonthName = "August";
                DaysInMonth = 31;
                break;
            case 9:
                MonthName = "September";
                DaysInMonth = 30;
                break;
            case 10:
                MonthName = "October";
                DaysInMonth = 31;
                break;
            case 11:
                MonthName = "November";
                DaysInMonth = 30;
                break;
            case 12:
                MonthName = "December";
                DaysInMonth = 31;
                break;
        }

                System.out.println("The " + MonthName + "has " + DaysInMonth + " days.");
            }

        }



