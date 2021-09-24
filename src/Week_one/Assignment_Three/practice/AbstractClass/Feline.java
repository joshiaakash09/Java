package Week_one.Assignment_Three.practice.AbstractClass;

/*
The Feline class below inherits from the abstract class Animal but it does not provide an implementation for the
abstract method speak. As a result, the Feline class needs to be abstract too.
 */

public class Feline extends DemoAnimal{
    public Feline(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return null;
    }
}
