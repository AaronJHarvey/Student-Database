import java.util.Scanner;

public class StudentDatabaseApp {

    public static void main(String[] args) {
        System.out.print("Enter number of new Students to enroll: ");
        Scanner in = new Scanner(System.in);
        int numOfStudents = in.nextInt();
        Student[] students = new Student[numOfStudents];
       
        for (int n = 0; n < numOfStudents; n++) {
            students[n] = new Student();
            students[n].enroll();
            students[n].payTuition();
        }
        students[0].showInfo();
        students[1].showInfo();


        
    }
    // Ask how many students should be created 

    //Create a new Student * n number of new students - Ask the students Name and Grade/Year
    
    // Return the Student's ID beginning with their grade

    // Ask the student to pick the course(s) they wish to enroll in add $600 to their balance for each
    
    // Getter for the Student's Balance 

    // Setter for the students balance when they make a payment 

    // Getter for the Student Status - Returning their name, ID, courses, and balance 
}
