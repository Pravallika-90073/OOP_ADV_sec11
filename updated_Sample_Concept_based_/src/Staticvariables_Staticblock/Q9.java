//Accept two integers and apply all bitwise operations (&, |, ^, <<, >>), 
//then display the results in both binary and decimal formats.

package Arithmetic_logical_bitwise_opeartors;
import java.util.Scanner;

public class Q9 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter first integer: ");
	        int a=sc.nextInt();
	        System.out.print("Enter second integer: ");
	        int b=sc.nextInt();
	        int andResult=a&b;
	        int orResult=a|b;
	        int xorResult=a^b;
	        int leftShift=a<<1;  
	        int rightShift=a>>1; 
	        
	        System.out.println("\n--Bitwise Operation Results--");
	        System.out.printf("a   = %d (%s)\n", a, Integer.toBinaryString(a));
	        System.out.printf("b   = %d (%s)\n\n", b, Integer.toBinaryString(b));

	        System.out.printf("a & b   = %d(%s)\n",andResult, Integer.toBinaryString(andResult));
	        System.out.printf("a | b   = %d(%s)\n",orResult, Integer.toBinaryString(orResult));
	        System.out.printf("a ^ b   = %d(%s)\n",xorResult, Integer.toBinaryString(xorResult));
	        System.out.printf("a << 1  = %d(%s)\n",leftShift, Integer.toBinaryString(leftShift));
	        System.out.printf("a >> 1  = %d(%s)\n",rightShift,Integer.toBinaryString(rightShift));

	        sc.close();
	    }
}
