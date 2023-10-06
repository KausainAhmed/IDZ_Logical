package com.logical.HackerRank;

import java.util.Scanner;

public class StringScanner {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int i = scan.nextInt();
		Double d = scan.nextDouble();
		scan.nextLine();
		String s = scan.nextLine();

		System.out.println("Int: " + i);
		System.out.println("Double: " + d);
		System.out.println("String: " + s);

	}
}
