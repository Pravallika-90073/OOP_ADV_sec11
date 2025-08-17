//Write a Java program to demonstrate the use of super keyword, Create a Person class with a constructor and a method.
//Create a Student class that extends Person class, now Use super() to call the parent class constructor (Use super.method())then Display student details including inherited data.

package Super_Keyword;
class Person {
    String name;
    int age;
    Person(String name, int age) {
        this.name=name;
        this.age=age;
        System.out.println("Person constructor called.");
    }
    void displayPersonDetails() {
        System.out.println("Name: "+name+",Age: "+age);
    }
}
class Student extends Person {
    int studentID;
    String course;
    Student(String name, int age,int studentID,String course) {
        super(name, age); 
        this.studentID=studentID;
        this.course=course;
        System.out.println("Student constructor called.");
    }
    void displayStudentDetails() {
        super.displayPersonDetails(); 
        System.out.println("Student ID: "+studentID+ ",Course: "+course);
    }
}

public class Q16 {
	 public static void main(String[] args) {
	        Student s1 = new Student("Pravallika", 20, 101, "Computer Science and Information technology.");
	        System.out.println("\n--Student Details--");
	        s1.displayStudentDetails();
	    }

}
