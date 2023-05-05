package com.exception;

public class Test {
	public static void main(String[] args) {

		System.out.println("First line");
		System.out.println("Second line");
		try {
			int a = 10 / 0;            
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		//System.out.println("Second line");
		catch(NullPointerException  x){
			String name=null;
			System.out.println(x);
			//System.out.println(name.length());
		}
		 /*catch(Exception f) {
		 int b=100/0;
		 System.out.println(f);
		 }*/
		System.out.println("fourth line");
	}
	}



