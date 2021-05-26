package A1T2.FlowChart;

public class FlowChart {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        int avg = (a+b+c)/3;

        System.out.println("Average of a, b and c is :" + avg);

        if (avg>a && avg>b && avg>c){
            System.out.println("Average is higher than a, b, c");
        } else if (avg>a && avg>b){
            System.out.println("Average is higher than a, b, c");
        } else if (avg>a && avg>c){
            System.out.println("Average is higher than a,c");
        }else if (avg>b && avg>c){
            System.out.println("Average is higher than b,c");
        }else if (avg>a){
            System.out.println("Average is just higher than a");
        }
        else if (avg>b){
            System.out.println("Average is just higher than b");
        }
        else if (avg>c){
            System.out.println("Average is just higher than c");
        }
    }
}
