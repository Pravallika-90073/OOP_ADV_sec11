//Write a program to check if a number is divisible by 3 AND 5 using logical operators.

package Arithmetic_logical_bitwise_opeartors;
import java.util.Scanner;

public class Q10 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println(num + " is divisible by both 3 and 5.");
        } else {
            System.out.println(num + " is NOT divisible by both 3 and 5.");
        }

        sc.close();
    }

}
