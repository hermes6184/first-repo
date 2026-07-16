import java.util.*;

public class ArraySorting {
    int a[] = new int[50];
    int i, j, limit, temp = 0;

    Scanner sc = new Scanner(System.in);

    void getArray() {
        System.out.println("Enter the limit:");
        limit = sc.nextInt();

        System.out.println("Enter the array elements:");
        for (i = 0; i < limit; i++) {
            a[i] = sc.nextInt();
        }
    }

    void Sort() {
        for (i = 0; i < limit; i++) {
            for (j = i + 1; j < limit; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    void display() {
        System.out.println("Sorted Array:");
        for (i = 0; i < limit; i++) {
            System.out.println(a[i]);
        }
    }

    public static void main(String[] args) {
        ArraySorting ar = new ArraySorting();

        ar.getArray();
        ar.Sort();
        ar.display();
    }
}