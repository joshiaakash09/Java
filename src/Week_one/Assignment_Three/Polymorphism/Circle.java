package Week_one.Assignment_Three.Polymorphism;

/*
class need not to be declared as a abstract if it implements all the methods of its super class or inherited class
 */
public class Circle extends Shape implements Printable{
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }
@Override
    public int area(){
        return (int) (Math.PI * radius * radius);
    }
@Override
    public void print(){
        System.out.println("Area of circle = "  + area());
    }

}
