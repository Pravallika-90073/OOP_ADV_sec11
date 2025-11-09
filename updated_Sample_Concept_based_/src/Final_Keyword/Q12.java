//Declare a final variable and try modifying it (intentionally). Observe and explain the compile-time error.

package Final_Keyword;

public class Q12 {
	public static void main(String[] args) {
        final int x=100;  
        System.out.println("Initial value of x: "+x);
        System.out.println("Trying to modify x gives a compile-time error because it's declared as final.");
    }
}
