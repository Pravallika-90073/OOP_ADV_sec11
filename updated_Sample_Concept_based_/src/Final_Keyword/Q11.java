//Write a program using final keyword to define a constant PI = 3.14159 and use it to calculate the area and 
//circumference of a circle. Take radius as input.

package Final_Keyword;
import java.util.Scanner;

public class Q11 {
	public static void main(String[] args) {
        final double PI=3.14159; 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius=sc.nextDouble();
        double area=PI*radius*radius;
        double circumference=2*PI*radius;
        System.out.printf("Area of the circle: %.2f\n",area);
        System.out.printf("Circumference of the circle: %.2f\n",circumference);
        sc.close();
    }
}
