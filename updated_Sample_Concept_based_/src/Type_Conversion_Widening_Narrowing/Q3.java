//Write a program to demonstrate widening type conversion from int → long → float. Show that no data is lost.

package Type_Conversion_Widening_Narrowing;

public class Q3 {
	public static void main(String[] args) {
        int intVal = 123456;
        long longVal = intVal;
        float floatVal = longVal;

        System.out.println("---Widening Type Conversion---");
        System.out.println("Original int value  : "+intVal);
        System.out.println("Converted to long   : "+longVal);
        System.out.println("Converted to float  : "+floatVal);
        if (floatVal == intVal) {
            System.out.println("\n No data is lost during conversion.");
        } else {
            System.out.println("\n Data might be lost.");
        }
    }

}
