/**
 * Lab04 Assignment2.
 *
 * @author (Sani Musa Muhammad u15/fns/csc/005)
 * @version (a version number or a date)
 */
public class BankAccount
{
   private int accountNumber;
   private String customerName;
   private double balance;
   public BankAccount( int _accountNumber , String _customerName , double _balance){
       accountNumber = _accountNumber;
       customerName = _customerName;
       balance = _balance;
    }
    public void deposit (double newDeposit){
        balance = newDeposit + balance;
     //return balance;
    }
    public void withdraw(double newWithdraw){
        balance = balance -newWithdraw ;
        //return balance;
    }
      public double getBalance(){
          return balance;
        }
}
