
package prog.ice.tak.pkg6;
import java.scanner

public class ProgIceTak6 {

        
    public class Person {
    private String name;
    private int age;
    private String email;

    // Constructor
    public Person(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    // Method to display person details
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
    }
   }


public class Student extends Person {
    private String studentID;

    // Constructor
    public Student(String name, int age, String email, String studentID) {
        super(name, age, email); // Call the constructor of the Person class
        this.studentID = studentID;
    }

    // Method to display student details
    public void displayStudentInfo() {
        displayInfo(); // Call the displayInfo method from Person class
        System.out.println("Student ID: " + studentID);
    }
}


public class Teacher extends Person {
    private String subject;

    // Constructor
    public Teacher(String name, int age, String email, String subject) {
        super(name, age, email); // Call the constructor of the Person class
        this.subject = subject;
    }

    // Method to display teacher details
    public void displayTeacherInfo() {
        displayInfo(); // Call the displayInfo method from Person class
        System.out.println("Subject: " + subject);
    }
}

public class Teacher extends Person {
    private String subject;

    // Constructor
    public Teacher(String name, int age, String email, String subject) {
        super(name, age, email); // Call the constructor of the Person class
        this.subject = subject;
    }

    // Method to display teacher details
    public void displayTeacherInfo() {
        displayInfo(); // Call the displayInfo method from Person class
        System.out.println("Subject: " + subject);
    }
}

}
    

