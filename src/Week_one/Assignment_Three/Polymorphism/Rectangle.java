package Week_one.Assignment_Three.Polymorphism;

public class Rectangle extends Shape implements Printable {
    private int height;
    private int weight;

    public Rectangle(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }


    @Override
    public int area() {
        return height * weight ;
    }

    @Override
    public void print() {
        System.out.println("Area of rectangle = " + area());
    }

}
