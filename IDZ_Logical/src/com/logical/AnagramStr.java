package com.logical;

import java.util.Arrays;

public class AnagramStr {

	static void IsAna(String str1, String str2) {
		/*
		 * String s1 = str1.replaceAll("//s", ""); String s2 = str1.replaceAll("//s",
		 * "");
		 */
		boolean result=true;
		if (str1.length() != str2.length()) {
		    result=false;
		} else {
			char[] c1 = str1.toLowerCase().toCharArray();
			char[] c2 = str2.toLowerCase().toCharArray();
			 result = false; 
			Arrays.sort(c1);
			Arrays.sort(c2);

			result = Arrays.equals(c1, c2);

		}
		if(result) {
			System.out.println("Same hai");
		}else {
			System.out.println("Same nahi hai");
		}
	}

	public static void main(String[] args) {
		IsAna("peek", "keep");
		
	}
}
