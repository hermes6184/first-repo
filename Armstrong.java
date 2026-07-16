import java.util.Scanner;

public class Armstrong {
    int num, temp, rem, sum = 0;
    Scanner sc = new Scanner(System.in);

    void getNum() {
        System.out.print("Enter the number: ");
        num = sc.nextInt();
    }

    void checkNum() {
        temp = num;

        while (temp != 0) {
            rem = temp % 10;
            sum = sum + (rem * rem * rem);
            temp = temp / 10;
        }

        if (num == sum) {
            System.out.println("Number is Armstrong");
        } else {
            System.out.println("Number is not Armstrong");
        }
    }

    public static void main(String[] args) {
        Armstrong ob = new Armstrong();
        ob.getNum();
        ob.checkNum();
    }
}