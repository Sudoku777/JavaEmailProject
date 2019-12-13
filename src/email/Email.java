package email;

import java.util.Scanner;

public class Email {

    private String firstName;
    private String lastName;
    private String password;
    private String email;
    private int defauldPasswordLenght=10;
    private String department;
    private int mailboxCapacity=500;
    private String alternateEmail;
    private String companySuffix= "yahoo.com";

    // Constructor to receive the first name and last name

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);

        //Call a method asking fot the department - return the department
        this.department = setDepartment();
        System.out.println("Department: "+this.department);

        //Call a method that return a random password
        this.password= randomPassword(defauldPasswordLenght);
        System.out.println("Your password is: "+this.password);

        //Combine elements to generate email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "" + companySuffix;
        System.out.println("You email is: " + email);
    }


    // ass for a department
    private String setDepartment(){
        System.out.print ("New Worker: " + firstName +
                ". Department Codes:\n1 for Sales\n2 Development\n3 for Accounting\n0 for none\n Enter department code");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if (depChoice == 1) {
            return "sales";
        } else if (depChoice == 2) {
            return "dev";
        } else if (depChoice == 3) {
            return "acct";
        } else {
            return "";
        }
    }

      // Generate a random password
            private String randomPassword(int lenght){
                String passwordSet= "ABCDEFGHIJKLMNOPQRSTUWXYZ0123456789!@#$%";
                char[] password = new char[lenght];
                for (int i=0;i<lenght;i++){
                 int ran = (int)(Math.random()*passwordSet.length());
                 password[i]=passwordSet.charAt(ran);
                }
                return new String(password);
            }

      //Set mail Box capacity
      public  void setMailboxCapacity(int capacity){
        this.mailboxCapacity=capacity;

      }

      // Set the alternate email
    public void setAlternateEmail(String altEmail){
        this.alternateEmail=altEmail;
    }

      // Change the password
    public  void changePassword(String password){
        this.password=password;
    }

    public int getMailboxCapacity() {
        return mailboxCapacity;
        }
   public String getAlternateEmail(){
        return alternateEmail;
   }
   public String getPassword(){
        return password;
   }
   public String showInfo(){
        return "Display name: "+ firstName + " " +lastName + "\n " +
                "Company email: " + email + "\n " +
                "MailBox cappacity: " + mailboxCapacity + "mb";
   }
}

