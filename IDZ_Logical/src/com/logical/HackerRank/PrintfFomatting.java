package com.logical.HackerRank;

import java.util.Scanner;

public class PrintfFomatting {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("================================");
		for (int i = 0; i < 3; i++) {
			String s1 = sc.next();
			int x = sc.nextInt();
			if(x<10) {
				System.out.println("0"+"0"+x);
			}
			else if(x<99 && x>10) {
				System.out.println("0"+x);
			}
			else {
				System.out.println(x);
			}
			System.out.println(s1 + "               "+x);
			
			System.out.println("================================");
		}
	}
}

class Format {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		String n=sc.nextLine();
		String res = String.format("%03d",Integer.parseInt(n));
		System.out.println(res);
	}
}

class Format2 {
	static String name;
	static int age;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i=0;
		while(i<3) {
		System.out.println("Enter name");
		 name = sc.nextLine();
		
		System.out.println("Enter age");
		 age = sc.nextInt();
		i++;
		}
		//adding 10blank spaces so that next value would be on exactly on 11th position
		String n = String.format("%-10s", name);
	System.out.println(n+""+age);
	}
}
