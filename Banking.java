

public class Banking {
    private double balance;
    private double amount;
    
    public Banking(double balance){
        this.balance = balance;
    }
    public double getBalance(){
        return balance;
    }

    public void deposit(){
        if (amount > 0){
            balance += amount;
            System.out.println("You have successfully deposit");
        }
        else {
            System.out.println("You have enter invalid amount");
        }
    }
    public void withdraw(){
        if (amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("You have withdraw successfully");
        } else {
            System.out.println("You have enter insuficcient amount");
        }
    }
    
}
