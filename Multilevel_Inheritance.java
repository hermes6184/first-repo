import java.util.*;

class Employee {
    String name;

    void getName(String n) {
        name = n;
    }

    void displayName() {
        System.out.println("Employee Name: " + name);
    }
}

class Manager extends Employee {
    String department;

    void getDepartment(String d) {
        department = d;
    }

    void displayDepartment() {
        System.out.println("Department: " + department);
    }
}

class SeniorManager extends Manager {
    int teams;

    void getTeams(int t) {
        teams = t;
    }

    void displayTeams() {
        System.out.println("Number of Teams: " + teams);
    }
}

public class EmployeeDetails {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        SeniorManager sm = new SeniorManager();

        System.out.println("Enter employee name:");
        String name = s.nextLine();

        System.out.println("Enter department:");
        String department = s.nextLine();

        System.out.println("Enter no. of teams:");
        int teams = s.nextInt();

        sm.getName(name);
        sm.getDepartment(department);
        sm.getTeams(teams);

        System.out.println("\nEmployee Details:");

        sm.displayName();
        sm.displayDepartment();
        sm.displayTeams();

        s.close();
    }
}