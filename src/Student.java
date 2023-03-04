import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private int studentId;
    private Array courses;
    private int tuitionBalance;
    private static int costOfCourse = 600;
    private static int id = 1000;


    // Constructor prompt user to enter Student's name and year 
    public Student() {
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Student first name: ");
        this.firstName = in.nextLine();

        System.out.print("Enter Student last name: ");
        this.lastName = in.nextLine();

        System.out.print("1 - Freshmen\n2 - Sophomore\n3 - Junior\n4 - Senior\n Enter Student class level: ");
        this.gradeYear = in.nextInt();
        
        setStudentID();

        System.out.println(firstName + " " + lastName + " - " + gradeYear + " " + studentId);

    }

    // Generate ID beginning with their year
    private void setStudentID() {
        // GradeLevel + ID
        id++;
        String x = String.valueOf(gradeYear) + String.valueOf(id);
        this.studentId = Integer.parseInt(x);

        
    }

    // Enroll in courses

    public void enroll() {
        // Enter a loop, user hits 0 when finished 
        ArrayList<String> enrolledCourses = new ArrayList<String>();
        String course;

        do {
            System.out.print("Enter course to enroll (Q for quit): ");
            Scanner in = new Scanner(System.in);
            course = in.nextLine();
            switch (course) {
                case "History 101":
                    if (enrolledCourses.contains(course)) {
                    System.out.println("You are already enrolled in that course. ");
                } else {
                    enrolledCourses.add(course);
                    System.out.println("    Course Added Successfully!");
                };
                    break;
                case "Mathematics 101":
                    if (enrolledCourses.contains(course)) {
                    System.out.println("You are already enrolled in that course. ");
                } else {
                    enrolledCourses.add(course);
                    System.out.println("    Course Added Successfully!");
                };
                    break;
                case "English 101":
                if (enrolledCourses.contains(course)) {
                    System.out.println("You are already enrolled in that course. ");
                } else {
                    enrolledCourses.add(course);
                    System.out.println("    Course Added Successfully!");
                };
                    break;
                case "Chemistry 101":
                if (enrolledCourses.contains(course)) {
                    System.out.println("You are already enrolled in that course. ");
                } else {
                    enrolledCourses.add(course);
                    System.out.println("    Course Added Successfully!");
                };
                    break;
                case "Computer Science 101":
                if (enrolledCourses.contains(course)) {
                    System.out.println("You are already enrolled in that course. ");
                } else {
                    enrolledCourses.add(course);
                    System.out.println("    Course Added Successfully!");
                };
                    break;
                case "Q":
                    break;
                default:
                    System.out.print("Invalid Entry! Please Try Again \n");
            }
        } while (!course.equals("Q"));

        String[] courses = enrolledCourses.toArray(new String[0]);
        String courseStr = Arrays.toString(courses);
        courseStr = courseStr.replaceAll("\\[", "").replaceAll("\\]","").replaceAll(", ","\n");
        tuitionBalance = costOfCourse * courses.length;
        
        System.out.println("COURSES YOU ARE ENROLLED IN: " + courseStr);
        System.out.println("\nTUITION BALANCE: " + tuitionBalance);



    }

    // View Balance 
    public void viewBalance() {
        System.out.println("Your balance is: $" + tuitionBalance);
    }

    // Pay tuition

    // Show Status (name, Id, courses, balance)


}
