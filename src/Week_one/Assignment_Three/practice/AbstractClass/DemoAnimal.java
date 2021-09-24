package Week_one.Assignment_Three.practice.AbstractClass;
/*
an abstract method is declared with the keyword abstract and given without an implementation. If a class includes
abstract methods, then the class itself must be declared abstract.

In Java, even a class that does not have any abstract methods can be declared as an abstract class.

When an abstract class is subclassed, the subclass should provides implementations for all of the abstract methods
in its superclass or else the subclass must also be declared abstract.
 */
public abstract class DemoAnimal {
    protected String name;

    public DemoAnimal (String name){
        this.name = name;
    }

    public abstract String speak();

    public static void main(String[] args) {
        DemoAnimal a = new DomesticCat("Juno");
    }
}
