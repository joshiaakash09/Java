package Week_one.Assignment_Three;

/*   Part 1:
Define a Circle class so that the code given below produces the given output. The nature of the class is a follows:

Attributes(all private):
int x, int y: represents the location of the circle
double radius: the radius of the circle
Constructors:
Circle(): initializes x, y, radius to 0
Circle(int x, int y, double radius): initializes the attributes to the given values
Methods:
getArea(): int
Returns the area of the circle as an int value (not double). Calculated as PI * (radius)2
 You can convert to double to an int using (int) e.g., x = (int)2.25 gives x the value 2.
 You can use Math.PI to get the value of Pi
 You can use Math.pow() to raise a number to a specific power e.g., Math.pow(3, 2) calculates 32

 ==========Part 2==========

Update it as follows so that code given below produces the given output.

Add getter/setter methods for all three attributes
Update the setters and constructors such that if the radius supplied is negative, the code automatically set
the radius to 0 instead.

 ==========Part 3 ==========
Add a class-level getMaxRadius method that returns the maximum radius that has been used in all Circle objects
created thus far.
 */

public class Circle {

    //Attributes
    private  int x;  //represents the location of the circle
    private  int y; //represents the location of the circle
    private  double radius; // the radius of the circle
    private static double maxRadius; //track the maximum value used for radius

    //constructor

    public Circle(){
        this(0,0,0);
    }

    public Circle(int x, int y, double radius) {
        setX(x);
        setY(y);
        setRadius(radius);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double getRadius() {
        return radius;
    }
      //setting radius to min 0
    public void setRadius(double radius) {
        this.radius = Math.max(radius, 0);
        if (maxRadius < this.radius){
            System.out.println(this.radius);
        }
    }

    public static double getMaxRadius() {
        return maxRadius;
    }

    // methods
    public int getArea(){
      double area = Math.PI * Math.pow(radius, 2);
      return (int) area;
    }

    //Part-3 method


    public static void main(String[] args) {
       Circle c = new Circle(1, 2, 5);
        System.out.println(c.getArea());

        c.setX(4);
        c.setY(5);
        c.setRadius(6);
        System.out.println("x : " + c.getX());
        System.out.println("y : " + c.getY());
        System.out.println("Radius : " + c.getRadius());
        System.out.println("Area : " + c.getArea());

        c.setRadius(-5);
        System.out.println("radius : " + c.getRadius());

        c = new Circle(1, 1, -4);
        System.out.println("radius : " + c.getRadius());

        //part-3
        System.out.println("Part-3");
        c = new Circle(0,0,10);
        System.out.println("Max radius used so far: " + Circle.getMaxRadius());
    }

}
