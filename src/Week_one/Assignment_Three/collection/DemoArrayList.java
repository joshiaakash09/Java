package Week_one.Assignment_Three.collection;

import java.util.ArrayList;
import java.util.List;

public class DemoArrayList {
    public static void main(String[] args) {
        List<String> items = new ArrayList<String>();
        System.out.println("before adding items" + items);

        //add items
        items.add("Apple");
        items.add("Box");
        items.add("Cups");
        items.add("Dart");

        System.out.println("after adding items " + items);

        //remove items by index value
        items.remove(1);
        //items remove by name
        items.remove("Dart");
        System.out.println("After removing");
        System.out.println(items);

        //adding more items
        items.add("Cup");
        items.add("Chair");
        items.add("table");
        System.out.println(items);

        //check size of array
        System.out.println(items.size());

        //check index of item
        System.out.println(items.lastIndexOf("table"));
        System.out.println(items.indexOf("Chair"));

        //add at particular index
        items.add(4, "Banana");
        System.out.println(items);

        //get value of particular index
        System.out.println(items.get(2));

        //check anything available by contains method which returns boolean
        System.out.println(items.contains("Chair"));
        System.out.println(items.contains("ball"));

        //clear arraylist
        items.clear();
        System.out.println(items);

    }
}
