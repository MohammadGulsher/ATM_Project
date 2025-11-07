package ATM_Project;

import java.util.Scanner;


public class ATMInterface {

	public static void main(String[] args) {
		System.out.println("Enter your Pin:");
		System.err.println("===============================");
		Scanner sc=new Scanner(System.in);
		int enteredpin=sc.nextInt();
		ATM atm=new ATM(1000.0,1234);
		
		if(!atm.authenticate(enteredpin))
		{
			System.err.println("Incorrect PIN. Access denied!");
			return;
		}
		
		while(true)
		{
			System.err.println(" ATM Menu");
			System.out.println("1. Check Balance");
			System.out.println("2. Deposite");
			System.out.println("3. Withdraw");
			System.out.println("4. Exits");
			System.out.println("Choose your option:");
			int choice=sc.nextInt();
			
			switch(choice)
			{
			case 1:
				System.err.println("Your Balance: $"+atm.getBalance());
				System.err.println("===============================");
				break;
				
			case 2:
				System.err.println("Enter deposite amount:");
				Double depositeAmount=sc.nextDouble();
				atm.deposite(depositeAmount);
				System.err.println("===============================");
				break;
				
			case 3:
				System.err.println("Enter withdrawal amount: ");
				double withdrawalAmount=sc.nextDouble();
				atm.withdraw(withdrawalAmount);
				System.err.println("===============================");
				break;
				
			case 4:
				System.err.println("Thank you for using ATM. Goodbye!");
				break;
				default:
			}
		}
	}

}
