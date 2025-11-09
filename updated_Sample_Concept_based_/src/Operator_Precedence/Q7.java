//Accept three numbers and calculate the average using a single expression. Analyze how precedence affects the result.
//Arithmetic, Logical and Bitwise Operators

package Operator_Precedence;
import java.util.Scanner;

public class Q7 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter first number: ");
	        int a = scanner.nextInt();
	        System.out.print("Enter second number: ");
	        int b = scanner.nextInt();
	        System.out.print("Enter third number: ");
	        int c = scanner.nextInt();

	        double average=(a+b+c)/3.0;

	        System.out.println("\n----- Arithmetic Operator Result -----");
	        System.out.println("Average of "+a+","+b+","+c+"="+average);

	        System.out.println("\n---Operator Precedence---");
	        int result=a+b*c; 
	        System.out.println("Expression a+b*c="+result);
	        System.out.println("Explanation: b*c="+(b*c)+",then add a="+a+"→Result="+result);

	        System.out.println("\n---Logical Operators---");
	        boolean logicalResult=(a>b)&&(c>b);
	        System.out.println("(a>b)&&(c>b)="+logicalResult);
	        System.out.println("\n---Bitwise Operators---");
	        int andResult=a&b;
	        int orResult=a|b;
	        int xorResult=a^b;
	        System.out.println("a&b(Bitwise AND)="+andResult);
	        System.out.println("a | b (Bitwise OR)="+orResult);
	        System.out.println("a ^ b (Bitwise XOR)="+xorResult);
	        scanner.close();
	    }

}
