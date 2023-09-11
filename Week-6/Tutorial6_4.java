import java.lang.*;
abstract class Shape {
    abstract double getPerimeter();
    abstract double getArea();
}

class Circle extends Shape {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double getPerimeter() {
        return 2*Math.PI*radius;
    }

    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }
}
public class Tutorial6_4 {
    public static void main(String[] args) {
        Circle c = new Circle(5.0);
        System.out.println("Perimeter: "+c.getPerimeter());
        System.out.println("Area: "+c.getArea());
    }
}
