import java.util.Scanner;

public class Student {
    // variables
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses;
    private int tuitionBalance;
    private static int costOfCourse = 600; // if something is static; the value is true for all objects
    private static int id = 1000;

    // Constructor that prompts name and year
    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter student first name: ");
        this.firstName = in.nextLine();
        System.out.println("Enter student last name: ");
        this.lastName = in.nextLine();
        System.out.println("1 - Freshmen\n2 - Sophomore\n3 - Junior\n4 - Senior \nEnter student class level: ");
        this.gradeYear = in.nextInt();
        System.out.println(firstName + " " + lastName + " " + gradeYear);

        setStudentID();

        // System.out.println(firstName + " " + lastName + " " + gradeYear + " " +
        // studentID);

    }

    // Generate 5 digit ID
    private void setStudentID() {
        id++;// Increment id by one when function is called
        // Grade level + Static ID
        // make a string
        this.studentID = gradeYear + "" + id; // this will be treated as a string now instead of an ID
    }

    // Enroll in Courses
    public void enroll() {
        // Get indside a loop, user hits 0
        do {
            System.out.println("Enter course to enroll (Q to quit): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("Q")) {
                courses = courses + "\n   " + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            } else {
                break;
            }
        } while (1 != 0);
        // System.out.println("ENROLLED IN: " + courses);
        // Test: System.out.println("TUITION IN: " + tuitionBalance);

    }

    // View Balance
    public void viewBalance() {
        System.out.println("Your balance is: $" + tuitionBalance);
    }

    // Pay Tuition
    public void payTuition() {
        viewBalance();
        System.out.println("Enter your payment: $");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment of $" + tuitionBalance);
        viewBalance();
    }

    // Show status
    public String toString() {
        return "Name: " + firstName + " " + lastName + "\nGrade Level: " + gradeYear + "\nStudent ID: " + studentID
                + "\nCourses Enrolled: " + courses + "\nBalance: $" + tuitionBalance;
    }

}