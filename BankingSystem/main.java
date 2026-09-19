package bankAccount;
public class Main {
public static void main(String[] args) {
// TODO Auto-generated method stub
// Create account with ID 1122 and balance $20,000
Account acc = new Account(1122, 20000);

// Set annual interest rate to 4.5%
Account.setAnnualInterestRate(4.5);

// Withdraw $2,500
acc.withdraw(2500);

// Deposit $3,000
acc.deposit(3000);

// Display final balance, monthly interest, and creation date
System.out.println("Account ID: " + acc.getId());
System.out.println("Balance: $" + acc.getBalance());
System.out.printf("Monthly Interest: $%.2f\n", acc.getMonthlyInterest());
System.out.println("Date Created: " + acc.getDateCreated());
}

}
