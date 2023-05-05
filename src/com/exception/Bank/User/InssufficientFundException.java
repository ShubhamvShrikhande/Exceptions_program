package com.exception.Bank.User;

public class InssufficientFundException extends RuntimeException{
	private String message;
	public InssufficientFundException(String message) {
		super(message);
	}

}
