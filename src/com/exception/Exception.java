package com.exception;

public class Exception {
	public static void main(String args[]) {
	Exception ex=new Exception();
	ex.add();
	}
	void add(){
		try {
		int a=100,b=0,c;
		c=a/b;
		System.out.println(c);
		}
		catch(ArithmeticException e) 
		{
			System.out.println(e);
		}
			
		}
	}



 