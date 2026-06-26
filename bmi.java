import java.util.Scanner;

public class BmiCalculator {

    float weight, height, bmi;

    void getData() {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter weight in kg:");
        weight = s.nextFloat();

        System.out.println("Enter height in m:");
        height = s.nextFloat();
    }

    void calculate() {
        bmi = weight / (height * height);

        if (bmi < 18.5) {
            System.out.println("Underweight");
        }
        else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("Normal");
        }
        else {
            System.out.println("Overweight");
        }
    }

    public static void main(String[] args) {
        BmiCalculator ob = new BmiCalculator();

        ob.getData();
        ob.calculate();
    }
}