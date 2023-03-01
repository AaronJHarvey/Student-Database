import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private int studentId;
    private String courses;
    private int tuitionBalance;
    private int costOfBalance; 

    // Constructor prompt user to enter Student's name and year 
    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Student first name: ");
        this.firstName = in.nextLine();

        System.out.print("Enter Student last name: ");
        this.lastName = in.nextLine();

        System.out.print("1 - Freshmen\n2 - Sophomore\n3 - Junior\n4 - Senior\n Enter Student class level: ");
        this.gradeYear = in.nextInt();

        System.out.println(firstName + " " + lastName + " - " + gradeYear);

    }

    // Generate ID beginning with their year

    // Enroll in courses

    // View Balance 

    // Pay tuition

    // Show Status (name, Id, courses, balance)


}
