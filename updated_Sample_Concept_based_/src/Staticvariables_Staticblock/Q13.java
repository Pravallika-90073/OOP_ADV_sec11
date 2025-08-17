//Write a Java program to demonstrate the use of static keyword in the context of a student management system,
//which includes: A static variable to represent the college name shared by all students,A static block to initialize 
//the static variable.
//A static method to change the college name and an Instance variables to store student ID and name.

package Staticvariables_Staticblock;
class Student {
    static String collegeName;
    int studentID;
    String studentName;
    static {
        collegeName="KLH University";
        System.out.println("Static block executed: College name initialized to " + collegeName);
    }
    public Student(int id, String name) {
        this.studentID=id;
        this.studentName= name;
    }
    static void changeCollegeName(String newName) {
        collegeName=newName;
    }
    void display() {
        System.out.println("ID: " + studentID + ", Name: " + studentName + ", College: " + collegeName);
    }
}
public class Q13 {
	public static void main(String[] args) {
        Student s1=new Student(101,"Pravallika");
        Student s2=new Student(102,"");
        System.out.println("\n--Before changing college name--");
        s1.display();
        s2.display();
        Student.changeCollegeName("IIT Hyderabad");
        System.out.println("\n--After changing college name--");
        s1.display();
        s2.display();
    }

}
