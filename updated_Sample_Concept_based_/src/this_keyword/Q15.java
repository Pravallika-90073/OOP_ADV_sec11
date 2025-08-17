//Write a Java program to demonstrate the use of this keyword with variables and this() for constructor chaining.
//Create a Student class with id, name, and course.Use this() to call a parameterized constructor from the default constructor.
//Use this.variable to differentiate instance variables.Display student details using a method. Create two objects (one with default and one with parameterized constructor) and display their details.

//Write a Java program to demonstrate the use of this keyword with variables and this() for constructor chaining.
//Create a Student class with id, name, and course.Use this() to call a parameterized constructor from the default constructor.
//Use this.variable to differentiate instance variables.Display student details using a method. Create two objects (one with default and one with parameterized constructor) and display their details.

package this_keyword;
class Student {
    int id;
    String name;
    String course;
    Student() {
        this(0, "Unknown", "Not Assigned"); 
        System.out.println("Default constructor called.");
    }
    Student(int id, String name, String course) {
        this.id = id;        
        this.name = name;
        this.course = course;
        System.out.println("Parameterized constructor called.");
    }
    void displayDetails() {
        System.out.println("ID: " + id + ", Name: " + name + ", Course: " + course);
    }
}

public class Q15 {
	public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student(101, "Pravallika", "Computer Scienceand and information technology");
        System.out.println("\n--Student Details--");
        s1.displayDetails();
        s2.displayDetails();
    }

}
