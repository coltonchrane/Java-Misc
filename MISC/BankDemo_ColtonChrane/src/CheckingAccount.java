
public class CheckingAccount extends BankAccount 
{
	
	private int withdrawals;
	
	public CheckingAccount(double balance)
	{
		super(balance);
	}
 /**
    Constructs a checking account with a zero balance.
 */

// These methods override superclass methods
 public void withdraw(double amount) 
 { 
	 final int FREE_WITHDRAWALS = 3;
	 final int WITHDRAWAL_FEE = 1;
	 
	 super.withdraw(amount);
	 withdrawals++;
	 if(withdrawals> FREE_WITHDRAWALS)
	 {
		 super.withdraw(WITHDRAWAL_FEE);;
	 }
 }
 public void monthEnd() 
 { 
	 withdrawals = 0;
 }
}
