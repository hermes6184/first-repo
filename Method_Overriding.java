import java.util.*;

class Vehicle
{
    String reg_no;
    int model;

    void read()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter registration no.:");
        reg_no = sc.nextLine();

        System.out.println("Enter model year:");
        model = sc.nextInt();
    }
}

class TwoWheeler extends Vehicle
{
    void read()
    {
        super.read();
        System.out.println("Reading data for a two wheeler.");
    }
}

class Scooter extends TwoWheeler
{
    int no_gear;
    int power;
    String manufacturer;
    String owner;

    void read()
    {
        super.read();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of gears:");
        no_gear = sc.nextInt();

        System.out.println("Enter power (cc):");
        power = sc.nextInt();

        sc.nextLine();

        System.out.println("Enter manufacturer:");
        manufacturer = sc.nextLine();

        System.out.println("Enter owner:");
        owner = sc.nextLine();
    }

    void print()
    {
        System.out.println("---- Scooter Details ----");
        System.out.println("Registration: " + reg_no);
        System.out.println("Model Year: " + model);
        System.out.println("No. of gears: " + no_gear);
        System.out.println("Power (cc): " + power);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Owner: " + owner);
    }
}

public class TestVehicle
{
    public static void main(String[] args)
    {
        Scooter scooty = new Scooter();

        scooty.read();
        scooty.print();
    }
}