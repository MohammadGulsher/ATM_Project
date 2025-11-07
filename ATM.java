package ATM_Project;

public class ATM {

private double balance;
	
	private int pin;

	public ATM() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ATM(double initialbalance, int pin) {
		super();
		this.balance = initialbalance;
		this.pin = pin;
	}
	
	public boolean authenticate(int enteredPin)
	{
		return this.pin == enteredPin;
	}
	
	
	public double getBalance()
	{
		return balance;
	}
	
	public void deposite(double amount)
	{
		if(amount>0)
		{
			balance +=amount;
			System.err.println("Deposite Succful! New balance:$"+balance);
		}else
		{
			System.err.println("Invalid deposite amount!");
		}
	}
	
	public void withdraw(double amount)
	{
		if(amount> 0 && amount<=balance)
		{
			balance-=amount;
			System.err.println("Withdrwal successful! ");
			System.err.println("New balance: $"+balance);
		}else
		{
			System.out.println("invalid or insufficient funds:");
		}
	}
}
