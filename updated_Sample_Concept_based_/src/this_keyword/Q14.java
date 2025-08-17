//Write a Java program to demonstrate a Scenario of banking system, use static keyword through the scenario.
//Static variables – to represent values shared among all objects,A static block – to initialize static data when the class is loaded,
//Static methods – to operate on static data,Use Instance variables and methods – to represent object-specific data.

package Staticvariables_Staticblock;
class BankAccount {
    static String bankName;
    static double interestRate;
    String accountHolder;
    double balance;
    static {
        bankName = "National Bank of Excellence";
        interestRate = 4.5; 
        System.out.println("Static block executed: Bank initialized with default interest rate " + interestRate + "%");
    }

    public BankAccount(String holder, double initialBalance) {
        this.accountHolder = holder;
        this.balance = initialBalance;
    }
    public static void updateInterestRate(double newRate) {
        interestRate = newRate;
        System.out.println("Interest rate updated to " + interestRate + "% for all accounts.");
    }
    public void deposit(double amount) {
        balance += amount;
        System.out.println(accountHolder + " deposited ₹" + amount + ". New balance: ₹" + balance);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(accountHolder + " withdrew ₹" + amount + ". Remaining balance: ₹" + balance);
        } else {
            System.out.println("Insufficient funds for " + accountHolder);
        }
    }
    public void displayAccountDetails() {
        System.out.println("Account Holder: " + accountHolder +
                           ", Balance: ₹" + balance +
                           ", Bank: " + bankName +
                           ", Interest Rate: " + interestRate + "%");
    }
}

public class Q14 {
	 public static void main(String[] args) {
	        BankAccount acc1 = new BankAccount("Hamisni", 5000);
	        BankAccount acc2 = new BankAccount("Gayatri", 3000);

	        System.out.println("\n--Initial Account Details--");
	        acc1.displayAccountDetails();
	        acc2.displayAccountDetails();

	        System.out.println("\n--Transactions--");
	        acc1.deposit(1500);
	        acc2.withdraw(1000);

	        System.out.println("\n--Updating Interest Rate--");
	        BankAccount.updateInterestRate(5.0);

	        System.out.println("\n--Updated Account Details--");
	        acc1.displayAccountDetails();
	        acc2.displayAccountDetails();
	    }

}
