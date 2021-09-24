package Week_one.Assignment_Three;

public class Enum {

    //DEFINED ENUMERATION
    public enum Priority{
        HIGH, MEDIUM, LOW
    }
    //DESCRIBE METHOD
    public static void describe(String color, Priority p){
        switch (p) {
            case LOW:
                System.out.println(color + " indicates low priority");
                break;
            case MEDIUM:
                System.out.println(color + " indicates medium priority");
                break;
            case HIGH:
                System.out.println(color + " indicates high priority");
        }
    }

    public static void main(String[] args) {
        //object created for instance method
        Enum firstP = new Enum();
        firstP.describe("Red", Priority.HIGH);
        Enum secondP = new Enum();
        secondP.describe("Orange", Priority.MEDIUM);
        Enum thirdP = new Enum();
        thirdP.describe("Blue", Priority.MEDIUM);
        Enum fourthP = new Enum();
        fourthP.describe("Green", Priority.LOW);

        //WITH STATIC METHOD ACCESSED DIRECTLY WITHOUT CREATING OBJECT OF ENUM CLASS
        describe("black", Priority.LOW);
        describe("yellow", Priority.LOW);
        describe("Purple", Priority.MEDIUM);

    }
}
