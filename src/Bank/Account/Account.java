package Bank.Account;

public class Account {
int accNum;
String accName;
double accBal;

Account(int accNum1,String accName1){
	accNum=accNum1;
	accName=accName1;
	accBal=0;
	}

public String getName() {
	return accName;
}
public int getAccount() {
	return accNum;
}
public void deposite(double amount) { //equivalent to setDeposite where you don't get any return value
	accBal=accBal+amount;
}
public double getBal() {
		return accBal;
		}

public void withdraw(double amount) {
	/*if (amount>accBal) {
	System.out.println("Your balance is lesser than entered mount.Withdrawl rejected");
	}
	else
	accBal=accBal-amount;
	}*/
	if (amount<=accBal) {
		accBal=accBal-amount;
		System.out.println("Your current balance is " +accBal);
	}
		else if (accBal==0) {
			System.out.println("You have zero balance left");
		}
	
	
	else {
		System.out.println("Y0u don't have enough balance for withdrawl");
	}

	}}

