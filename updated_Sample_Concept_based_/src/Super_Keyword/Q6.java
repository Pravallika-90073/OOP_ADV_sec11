//Evaluate and print the result of the following expressions:
//10 + 2 * 5
//(10 + 2) * 5
//100 / 5 + 2 * 3 - 4
package Operator_Precedence;

public class Q6 {
	public static void main(String[] args) {
		int result1=10+2*5;
		int result2=(10+2)*5;
		int result3=100/5+2*3-4;
		System.out.println("---Experssion Evaluation Results---");
		System.out.println("10 + 2 * 5           = " + result1);
	    System.out.println("(10 + 2) * 5         = " + result2);
	    System.out.println("100 / 5 + 2 * 3 - 4  = " + result3);
	    }
}
