import java.util.Scanner;

public class SavingsAccountimpl {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        SavingsAccount object = new SavingsAccount("","Arjun",0,"Active");

          object.accountNumber = object.getAccountNumber();

        System.out.println(" Please Enter Your Name");
        object.holdersName = scanner.nextLine();

        System.out.println(" Please Enter The Amount to Deposit");
        object.accountBalance = object.deposit(scanner.nextDouble());

        System.out.println(" Please Enter The Amount to Withdraw");
        object.accountBalance = object.withdraw(scanner.nextDouble());

        System.out.println(" Please Enter The Amount to Transfer");
        object.accountBalance = object.transfer(scanner.nextDouble());

        System.out.println("holdersName = " + object.holdersName);
        System.out.println("accountNumber = " + object.accountNumber);
        System.out.println("Status = " + object.status());
        System.out.println("CheckBalance = " + object.checkBalance());

    }
}
