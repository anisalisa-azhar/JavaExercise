import java.util.Scanner;

public class bankingSystem {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Banking bank = new Banking(0);

        boolean running = true;
        while (running) {
        System.out.println("--- Banking Operation Menu ---");
        System.out.println("Choose below option to continue or press 4 to exit");
        System.out.println("1. Check current balance ");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("4. Exit the program");
        System.out.println();
        int choice = scanner.nextInt();
        scanner.nextLine();

        
        switch(choice){
            case 1:
            System.out.println("\n Current balance: ");
            bank.getBalance();
            break;
            case 2: 
            System.out.println("Please enter amount to deposit money ");
            double depositAmount = scanner.nextDouble();
            
            bank.deposit();
            System.out.println("You have added: RM " + depositAmount);
            break;
            case 3:
            System.out.println("Please enter amount to withdraw money ");
            double withdrawAmount = scanner.nextDouble();
            bank.withdraw();
            System.out.println("You have withdraw: RM " + withdrawAmount);
            case 4:
            running = false;
            System.out.println("Exiting the system.");
            break;
            default:
            System.out.println("Invalid option. Please choose again");
        }
       // scanner.close();
    }

    } 
    
}
