//Accept a character from the user and display its ASCII value. Also convert that ASCII value into an integer.

package Type_Conversion_Widening_Narrowing;
import java.util.Scanner;

public class Q5 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a character: ");
	        char ch = scanner.next().charAt(0);
	        int asciiValue = (int) ch;
	        System.out.println("\n----- Character to ASCII -----");
	        System.out.println("Character entered : " + ch);
	        System.out.println("ASCII value       : " + asciiValue);
	        System.out.println("Integer value     : " + asciiValue); 
	        scanner.close();
	    }

}
