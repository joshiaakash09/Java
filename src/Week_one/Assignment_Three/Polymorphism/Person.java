package Week_one.Assignment_Three.Polymorphism;

public class Person implements Printable{
    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("Name = " + name);
    }

    @Override
    public int area() {
        return 0;
    }
}
