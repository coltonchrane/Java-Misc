import java.util.Scanner;
public class BankDemo
{

	public static void main(String[] args)
	{
		CheckingAccount checking = new CheckingAccount(100.00);
		SavingsAccount saving = new SavingsAccount(100.00);
		checking.deposit(20);
		checking.withdraw(5);
		checking.withdraw(5);
		checking.withdraw(5);
		checking.withdraw(5);
		System.out.println(checking.balance);
		checking.monthEnd();

		
	}
}
