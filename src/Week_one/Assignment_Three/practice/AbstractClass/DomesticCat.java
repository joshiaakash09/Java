package Week_one.Assignment_Three.practice.AbstractClass;

/*
The DomesticCat class inherits the abstract Feline class and provides the implementation for the abstract method
speak. As a result, it need not be (but can be) declared as abstract.
 */

public class DomesticCat extends Feline{
    public DomesticCat(String name) {
        super(name);
    }

    @Override
    public String speak(){
        return "Meow";
    }
}
