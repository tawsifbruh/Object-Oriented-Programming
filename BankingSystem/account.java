package bankAccount;
import java.util.Date;
public class Account {
//Data Fields
private int id;
private double balance;
private static double annualInterestRate; // All accounts share the same interest rate
private Date dateCreated;

// No-arg constructor
public Account() {
this.id = 0;
this.balance = 0;
this.dateCreated = new Date(); // current date
}

// Constructor 
public Account(int id, double balance) {
this.id = id;
this.balance = balance;
this.dateCreated = new Date(); // current date
}

// getter methods
public int getId() {
return id;
}

public double getBalance() {
return balance;
}

public static double getAnnualInterestRate() {
return annualInterestRate;
}

public Date getDateCreated() {
return dateCreated;
}

// setter methods
public void setId(int id) {
this.id = id;
}

public void setBalance(double balance) {
this.balance = balance;
}

public static void setAnnualInterestRate(double rate) {
annualInterestRate = rate;
}

// monthly interest rate 
public double getMonthlyInterestRate() {
return annualInterestRate / 12 / 100;
}

// Returns monthly interest amount
public double getMonthlyInterest() {
return balance * getMonthlyInterestRate();
}

// Withdraw method
public void withdraw(double amount) {
if (amount <= balance) {
balance -= amount;
} else {
System.out.println("Insufficient balance for withdrawal.");
}
}

// Deposit method
public void deposit(double amount) {
balance += amount;
}
}
