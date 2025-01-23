public class BankAccount {
    String accountHolder;
     double balance;

    public BankAccount(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
            balance += amount;
            System.out.println("Amount deposited  "+amount);
      
    }

    public void withdraw(double amount) {
    if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Succefully withdraw amount "+amount);
        } 
    else {
            System.out.println("Insufficient balance ");}
    }

    public void displayBalance() {
        System.out.println("Current Balance : " + balance);
        
    
    
    }

    public void displayDetails()
    {
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Balance : " + balance);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("Ankush Jaykar", 500);
        account.displayDetails();
        account.deposit(200);
        account.displayBalance();
        account.withdraw(100);
        account.displayBalance();
    }
}
