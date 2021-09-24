package Week_one.Assignment_Three.practice;

public class Practice {
    public static void main(String[] args) {

        //to call instance method, need to create object
        Practice p = new Practice();
        System.out.println(p.secondSinceMidnight(1, 2, 3));

        //to can call static method directly without creating object
        System.out.println(MinuteSinceMidnight(1, 2));

    }

    //instance method

    public int secondSinceMidnight(int hour, int minute, int second){
        return hour*60*60 + minute*60 + second;
    }

    //static method
    public static int MinuteSinceMidnight(int hour, int minute){
        return hour*60 + minute;
    }
}
