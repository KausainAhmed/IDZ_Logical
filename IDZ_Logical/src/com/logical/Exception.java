package com.logical;

public class Exception {
	public static void main(String[] args) {
try {
int c=10/0;
	System.out.println(c); }
	catch(ArithmeticException f) {
		f.printStackTrace();
	}
	System.out.println("Rest of code");
}
}

class CustomEx{
	public static void validate(int age) {
		if(age<18) {
			throw new ArithmeticException("Not eligible to vote");
		}else 
			System.out.println("eligible to vote");
	}
	public static void main(String[] args) {
		validate(12);
	}
}