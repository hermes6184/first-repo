import java.util.*;

abstract class Shape {
    abstract void area();
}

class Circle extends Shape {
    double radius;

    Circle(double r) {
        radius = r;
    }

    void area() {
        double a = Math.PI * radius * radius;
        System.out.println("Area of Circle = " + a);
    }
}

class Rectangle extends Shape {
    double length, breadth;

    Rectangle(double l, double b) {
        length = l;
        breadth = b;
    }

    void area() {
        double a = length * breadth;
        System.out.println("Area of Rectangle = " + a);
    }
}

public class AreaOfShapes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter radius of circle:");
        double r = sc.nextDouble();

        Circle c = new Circle(r);
        c.area();

        System.out.println("Enter length of rectangle:");
        double l = sc.nextDouble();

        System.out.println("Enter breadth of rectangle:");
        double b = sc.nextDouble();

        Rectangle rec = new Rectangle(l, b);
        rec.area();

        sc.close();
    }
}