import java.util.*;

class Person
{
    String name;

    void getName(String n)
    {
        name = n;
    }

    void displayName()
    {
        System.out.println("Name: " + name);
    }
}

class Student extends Person
{
    int mark;

    void getMark(int m)
    {
        mark = m;
    }

    void displayStudent()
    {
        System.out.println("Student Mark: " + mark);
    }
}

class Teacher extends Person
{
    String subject;

    void getSubject(String s)
    {
        subject = s;
    }

    void displayTeacher()
    {
        System.out.println("Subject: " + subject);
    }
}

public class Hierarchical_Inheritance
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        Student s = new Student();

        System.out.println("Enter student name:");
        String studentName = sc.nextLine();

        System.out.print("Enter student mark:");
        int mark = sc.nextInt();

        s.getName(studentName);
        s.getMark(mark);

        System.out.println("\nStudent Details");
        s.displayName();
        s.displayStudent();

        sc.nextLine();

        Teacher t = new Teacher();

        System.out.print("\nEnter teacher name:");
        String teacherName = sc.nextLine();

        System.out.print("Enter subject:");
        String subject = sc.nextLine();

        t.getName(teacherName);
        t.getSubject(subject);

        System.out.println("\nTeacher Details");
        t.displayName();
        t.displayTeacher();

        sc.close();
    }
}
