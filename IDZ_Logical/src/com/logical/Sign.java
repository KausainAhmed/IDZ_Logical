package com.logical;

public class Sign {
	static String fname = "Kausain";
	static String lname = "Ahmed";
	static char f, l;

	public static void main(String[] args) {
		for (int i = 0; i < fname.length(); i++) {
			for (int j = 0; j < lname.length(); j++) {
				f = fname.charAt(0);
				l = lname.charAt(0);
			}
		}
		System.out.println(f + " " + l);
	}
}
