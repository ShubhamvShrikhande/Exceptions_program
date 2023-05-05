package com.exception.Bank;

public class MainClass {
	public static void main(String []args) {
		Account account=new Account();
		System.out.println("Balance="+account.getBalance());
		try {
			account.withdraw(60000);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Balance="+account.getBalance());
	}

}
