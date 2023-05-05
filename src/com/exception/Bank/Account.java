package com.exception.Bank;

public class Account {
	private int balance=50000;

	public int getBalance() {
		return balance;
	}

   public void withdraw(int withrawAmmount) {
	   if(withrawAmmount> balance) {
		   throw new InsufficientFundException("Insufficient Balance in youre Account");
	   }
	   balance = balance-withrawAmmount;
   }
	

}
