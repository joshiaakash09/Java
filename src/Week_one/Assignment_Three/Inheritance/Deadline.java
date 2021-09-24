package Week_one.Assignment_Three.Inheritance;

//class inherits from the Todo class
public class Deadline extends Todo{
    public String by;

    //constructor
    public Deadline(String description, String by) {
        super(description);
        this.by = by;
    }

    //corresponding setBy(String) method.
    public void setBy(String by) {
        this.by = by;
    }

    //a getBy() method to access the value of the by field
    public void getBy(String by){
        this.by = by;
    }
}
