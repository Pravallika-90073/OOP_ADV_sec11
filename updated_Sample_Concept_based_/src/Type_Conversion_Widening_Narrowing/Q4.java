//Write a program to demonstrate narrowing type conversion from double to int. 
//Accept a double input and cast it to int. Print both values.

package Type_Conversion_Widening_Narrowing;
import java.util.Scanner;

public class Q4 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a decimal number (double): ");
	        double doubleValue = scanner.nextDouble();
	        int intValue = (int) doubleValue;
	        System.out.println("\n----- Narrowing Type Conversion -----");
	        System.out.println("Original double value: " + doubleValue);
	        System.out.println("Converted int value  : " + intValue);

	        scanner.close();
	    }

}
