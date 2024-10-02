

public class Banking {
    private double balance;
    
    public Banking(double balance){
        this.balance = balance;
    }
    public double getBalance(){
        double currentBalance = balance + 0;
        return currentBalance;
    }

    public void deposit(double amount){
        if (amount > 0){
            balance += amount;
            System.out.println("You have successfully deposit");
            System.out.println("Your current balance is: RM " + balance);
        }
        else {
            System.out.println("You have enter invalid amount");
        }
    }
    public void withdraw(double amount){
        if (amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("You have withdraw successfully");
            System.out.println("Your current balance is: RM " + balance);
        } else {
            System.out.println("You have enter insuficcient amount");
        }
    }
    
}
