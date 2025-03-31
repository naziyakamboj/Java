abstract class BankAccount {
    int accountnumber;
    String accountHolderName;
    double balance;

    BankAccount(int accNo, String name, double bal) {
        accountnumber = accNo;
        accountHolderName = name;
        balance = bal;
    }
    abstract void calculateInterest();

    void deposit(double amount){
        balance = balance + amount;
    }
}
class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(int accNo, String name, double bal, double rate){
        super(accNo, name, bal);
        interestRate = rate;

        }
        void calculateInterest(){
            balance = balance * interestRate / 100;
        } 
    }
class CurrentAccount extends BankAccount {
    CurrentAccount(int accNo, String name, double bal){
        super(accNo, name, bal);
    }
    void calculateInterest() {}
}

public class CalcInterest {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount(101, "Alice", 1000, 5);
        CurrentAccount current = new CurrentAccount(102, "Bob", 2000);
        
        savings.calculateInterest();
        savings.deposit(500);
        
        current.calculateInterest();
        current.deposit(1000);
        
        System.out.println("Savings Account Balance: " + savings.balance);
        System.out.println("Current Account Balance: " + current.balance);
    }
}
