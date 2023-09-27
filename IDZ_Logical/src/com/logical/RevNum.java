package com.logical;

public class RevNum {
	public static int Rev(int num) {
		int rem;
		int rev = 0;

		while (num != 0) {
			rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		return rev;
	}

	public static void main(String[] args) {
		System.out.println(Rev(1234));
	}
}

//reverse a string
class RevStr {
	public static String Rev(String name) {
		String reverse = " ";
		for (int i = name.length() - 1; i >= 0; i--) {
			reverse = reverse + name.charAt(i);
		}
		return reverse;
	}

	public static void main(String[] args) {
		System.out.println(Rev("abc"));
	}
}
