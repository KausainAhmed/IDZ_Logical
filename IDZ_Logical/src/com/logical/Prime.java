package com.logical;

import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		boolean IsPrime = true;

		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				IsPrime = false;
				break;
			}
		}

		if (IsPrime && num > 1) {
			System.out.println(num + " is Prime");
		} else {
			System.out.println(num + " is not prime");
		}
	}
}
