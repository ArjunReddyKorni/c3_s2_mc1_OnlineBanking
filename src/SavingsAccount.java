import java.util.Random;

public class SavingsAccount {

    String accountNumber;
    String holdersName;
    double accountBalance;
    String status;

    SavingsAccount(String accountNumber,String holdersName,double accountBalance, String status){
        this.accountNumber = accountNumber;
        this.holdersName = holdersName;
        this.accountBalance = accountBalance;
        this.status = status;
    }

    public  String getAccountNumber(){
        Random object = new Random();
        String number = "";
        for (int i = 0; i <12 ; i++)
            number = number + object.nextInt(9);


        return number;
    }
    public double withdraw(double withdrawedAmount){
        if(withdrawedAmount < accountBalance){
            accountBalance = accountBalance - withdrawedAmount;}
        return accountBalance;
    }
    public double deposit(double deposit){

        return accountBalance = accountBalance + deposit;
    }
    public double checkBalance(){

        return accountBalance;
    }
    public String status(){

        return status;
    }
    public double transfer(double amountToBeTransfered){
        if(amountToBeTransfered < accountBalance)
            accountBalance = accountBalance - amountToBeTransfered;
        return accountBalance;
    }


}
