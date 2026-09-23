import java.util.*;

class AreaOverload {
    double ar;

    void area(int r) {
        ar = 3.14 * r * r;
        System.out.println("Area of circle = " + ar);
    }

    void area(float s) {
        ar = s * s;
        System.out.println("Area of square = " + ar);
    }

    void area(int l, int b) {
        ar = l * b;
        System.out.println("Area of rectangle = " + ar);
    }
}

public class AreaMain {
    public static void main(String[] args) {

        AreaOverload ob = new AreaOverload();

        int choice;

        do {
            System.out.println("Menu");
            System.out.println("-----");
            System.out.println("1. Area of Circle");
            System.out.println("2. Area of Square");
            System.out.println("3. Area of Rectangle");
            System.out.println("4. Exit");
            System.out.println("Choose an option");

            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Enter the radius:");
                    int rad = sc.nextInt();
                    ob.area(rad);
                    break;

                case 2:
                    System.out.println("Enter the side:");
                    float side = sc.nextFloat();
                    ob.area(side);
                    break;

                case 3:
                    System.out.println("Enter the length:");
                    int length = sc.nextInt();

                    System.out.println("Enter the breadth:");
                    int breadth = sc.nextInt();

                    ob.area(length, breadth);
                    break;

                case 4:
                    System.out.println("Exit");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 4);
    }
}