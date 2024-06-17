package SimpleBankingSystem;
import java.util.Scanner;

public class Main {

    public static void main (String[] args) {
        
        Bank usr_1 = new Bank("John", 5000.0);

        System.out.println("Hello, " + usr_1.getUsrName() +" " + "What would you like to do?");

        Scanner scanner = new Scanner(System.in);

        boolean running = true;

        while (running) {
            System.out.println("1. Deposit Amount: ");
            System.out.println("2. Withdraw Amount: ");
            System.out.println("3. Show Balance: ");
            System.out.println("4. Exit");

            System.out.println("Please Enter a Choice below :)");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("1. Deposit Amount: ");
                    double depositAmount = scanner.nextDouble();
                    usr_1.deposit(depositAmount); 
                    
                    System.out.println("Succesfully Deposited " + " " + depositAmount + "\nYour new balance is " + ""+ usr_1.getAmount()+ "\n") ;
                    break;

                case 2:
                    System.out.println("2. Withdraw Amount: ");
                    double withdrawAmount = scanner.nextDouble();
                    usr_1.withdraw(withdrawAmount); 
                    System.out.println("Succesfully Deposited " + " " + withdrawAmount + "\nYour new balance is " + ""+ usr_1.getAmount()+ "\n");  
                    break;

                case 3:
                    System.out.println(usr_1.getAmount());
                    break;                
                
                case 4:
                    running = false;
                    break;  // Break out of the switch-case

                default:
                    System.out.println("Invalid choice, please try again.");
                    break;
            }
        }
        scanner.close();
    }
}
