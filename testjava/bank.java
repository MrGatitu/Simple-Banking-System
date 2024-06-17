package testjava;

public class Bank {
    private String usrName;
    private double amount;

    public Bank(String usrName, double amount){
        this.usrName = usrName;
        this.amount = amount;
    }
    
    // Returns User's name
    public String getUsrName(){
        return usrName;
    }

    // Gets User's Bank balance
    public double getAmount(){
        return amount;
    }

    public double deposit(double usrDeposit){
        if(usrDeposit > 0){
            amount += usrDeposit;
        } else {
            System.out.println("Deposits should be greater than 1");
        }
        return amount;    
    }

    public double withdraw(double usrWithdraw){
        if(usrWithdraw > 0 && usrWithdraw <= amount){
            amount -= usrWithdraw;
        } else {
            System.out.println("Insufficient balance");
        }
        return amount;
    }
}
