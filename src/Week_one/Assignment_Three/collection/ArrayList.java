package Week_one.Assignment_Three.collection;

// Use an ArrayList to store the numbers
//Add the missing methods to the class given below so that it produces the output given.

import java.util.List;

public class ArrayList{
    private static List<Integer> number = new java.util.ArrayList<Integer>();

    //Add methods
    private static void addNumber(int i) {
        number.add(i);
        System.out.println(number);
    }

    //getTotal method return sum of array
    private static void getTotal(){
        int sum = 0;

        for (int i=0; i<number.size(); i++){
            sum = sum + number.get(i);
        }
        System.out.println("The total is: " + sum);
    }

    //check if element available(contains method)

    private static void isFound(int i){
        number.contains(i);
        System.out.println(i + " is in the list : " + number.contains(i));
    }

    //remove number from the arraylist by Object
    private static void removeNumber(Object obj){
        number.remove(obj);
        System.out.println(number);
    }
    public static void main(String[] args) {

        System.out.println("adding number to arraylist");
        addNumber(3);
        addNumber(8);
        addNumber(24);
        getTotal();
        isFound(8);
        isFound(5);
        removeNumber(8);
        getTotal();




    }

}
