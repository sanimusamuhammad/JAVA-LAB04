import java.util.Scanner;
/**
 * Lab04 Assignment2.
 *
 * @author (Sani Musa Muhammad u15/fns/csc/005)
 * @version (a version number or a date)
 */
public class BankAccountDemo
{
    public static void main(String[] args){
        Scanner input =  new Scanner(System.in);
       
        System.out.println("your Account Number ");
        int accountNumber = input.nextInt();
        
        System.out.println("your Name is " );
        String customerName = input.next();
        
        System.out.println("your balance is" );
        double balance = input.nextDouble();
        
        BankAccount Customer = new BankAccount(accountNumber , customerName , balance );
        
        System.out.println("amount to deposit");
        double depositAmt = input.nextDouble();
        Customer.deposit(depositAmt);
        System.out.println("you current Account balance is " + Customer.getBalance());
        
        System.out.println("amount to withdraw");
        double withdrawAmt = input.nextDouble();
        Customer.withdraw(withdrawAmt);
        System.out.println("you current Account balance is " + Customer.getBalance());
        
    }
}
