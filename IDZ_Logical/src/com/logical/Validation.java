package com.logical;

import java.util.Scanner;

public class Validation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please register here");
		System.out.println("x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-");
		System.out.println();
		System.out.println("Enter Your First Name");
		String fname = sc.nextLine();
		String name = fname.trim().toLowerCase();
		Scanner st = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = st.nextInt();
		System.out.println("Your password is your first name+your age eg. Tyao21");
		String pass = name + age;
		// System.out.println(pass);
		System.out.println("Welcome to login");
		System.out.println("x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-");
		System.out.println("Please enter your password to Login");
		String inp = sc.nextLine();
		if (inp.equals(pass)) {
			System.out.println("Login Successfull");
		} else {
			System.out.println("Invalid Credentials");
		}
	}
}
