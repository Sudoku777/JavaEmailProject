package studentDatabase;

import java.util.Scanner;

public class Student {

    private String firstName;
    private  String lastName;
    private int grateYear;
    private int studentId;
    private String courses;
    private int tuitionBalance;
    private  int costOfCourse = 600;

    //Constructor prompt user to enter student's name and year

            public Student(){
                Scanner in = new Scanner(System.in);

                System.out.println("Enter student first name: ");
                this.firstName = in.nextLine();

                System.out.println("Enter student last name: ");
                this.lastName = in.nextLine();

                System.out.println("1 - Freshmen\n2 - for Sophmore\n3 - Junior\n4 - Senior\n Enter student class level: ");
                this.grateYear = in.nextInt();
                System.out.println(firstName + " " + lastName + " " + grateYear );
            }
    //Generate an ID

    //Enroll in courses

    //View balance

    //Pay Tuition

    //Show status


}
