package com.logical;

public class Vowel_Const {
	static int c = 0, v = 0;
	static String str = "This is my First Program";

	public static void main(String[] args) {
		System.out.println(str.toLowerCase());
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {
				v = v + 1;
			} else if (str.charAt(i) > 'a' && str.charAt(i) < 'z') {
				c = c + 1;
			}
		}
		System.out.println("Number of vowel " + v + " Number of consonant is " + c);
	}
}