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
}

public class RectangleDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length: ");
        int length = sc.nextInt();

        System.out.print("Enter the breadth: ");
        int breadth = sc.nextInt();

        Rectangle r = new Rectangle(length, breadth);
        r.area();
    }
}