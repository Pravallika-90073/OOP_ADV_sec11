//String Class – Immutability, String Pool, equals() vs ==
//A login system compares entered usernames with those in the database.
//Create a class LoginSystem that stores usernames using String.
//Accept an input username and check:
	//If it matches using equals().
	//If it refers to the same object using ==.
//Print output explaining both results.

package Module_1;

import java.util.Scanner;

public class q4_Module1 {
    static class LoginSystem {
        private String storedUsername;
        public LoginSystem(String storedUsername) {
            this.storedUsername = storedUsername;
        }
        public void checkLogin(String enteredUsername) {
            boolean equalsResult=storedUsername.equals(enteredUsername);
            boolean doubleEqualsResult=(storedUsername==enteredUsername);
            System.out.println("Checking login for username: "+enteredUsername);
            System.out.println("Using equals(): "+equalsResult);
            System.out.println("Using == : "+doubleEqualsResult);
            if(equalsResult){
                System.out.println("Login successful–value matches.");
            }else{
                System.out.println("Login failed–value does not match.");
            }
            System.out.println("---------------");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LoginSystem system = new LoginSystem("Pravallika");
        System.out.print("Enter username: ");
        String usernameInput=sc.nextLine();
        system.checkLogin(usernameInput);
        String sameLiteral = "Pravallika";
        system.checkLogin(sameLiteral);
        String newStringObject = new String("Pravallika");
        system.checkLogin(newStringObject);

        sc.close();
    }
}