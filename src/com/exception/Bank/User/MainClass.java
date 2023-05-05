package com.exception.Bank.User;

public class MainClass {
	public static void main(String args[]) {
		Account account=new Account();
		System.out.println("currentr balance="+account.balance());
		account.withdraw(3500);
		System.out.println("current balance="+account.balance());
	}

}
