import java.util.*;

class Rectangle {
    int length, breadth;

    Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    void area() {
        int result = length * breadth;
        System.out.println("Area of Rectangle: " + result);
    }

    protected void finalize() {
        System.out.println("Rectangle object destroyed");
    }
}

public class Rectangle {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter length = ");
        int length = s.nextInt();

        System.out.println("Enter breadth: ");
        int breadth = s.nextInt();

        Rectangle r = new Rectangle(length, breadth);

        r.area();

        r = null; // removes the reference to the object

        System.gc(); // request JVM to run garbage collector

        System.out.println("End of the program");
    }
}