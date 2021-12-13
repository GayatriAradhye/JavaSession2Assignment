package Bank.Account;

import java.util.Scanner;

public class Bank{
public static void main(String[] args) {
		Account A=new Account(123,"Gayatri");
		System.out.println("Name and Account Number is "+A.getName()+" and "+A.getAccount());
		System.out.println("Initial Balance is "+A.getBal());
		System.out.println("\n---Please enter the deposit amount---");
		Scanner input=new Scanner(System.in);
		double Deposite1=input.nextDouble();
		A.deposite(Deposite1);
		System.out.println("Current Balance is " +A.getBal());
		System.out.println("\n---Please enter the withdrawl amount---");
		double Withdraw1=input.nextDouble();
		A.withdraw(Withdraw1);
		//Trying to withdraw when balance is zero
		double Withdraw2=input.nextDouble();
		A.withdraw(Withdraw2);
	}

}
