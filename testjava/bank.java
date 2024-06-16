package testjava;

class bank {
    private String usrName;
    private double amount;

    public bank(String usrName, Double amount){
        this.usrName = usrName;
        this.amount =amount;
    }
    
    // Returns User's name
    public String get_usrName(){
        return usrName;
    }
    // Gets User's Bank balance
    public double getamount(){
        return amount;
    }

    public double deposit (double usr_deposit){
        if(usr_deposit > 0){
            usr_deposit += amount;
        }else{
            System.out.println("Deposits should be greater than 1");
        }
        return amount;    
    }
    public double withdraw(double usr_withdraw){
        if(usr_withdraw > 0 && usr_withdraw <= amount){
            usr_withdraw -=amount;
        } else{
            System.out.println("Insufficient balance");
        }

        return amount;
    }
}