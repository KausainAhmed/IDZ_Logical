package com.logical;

import java.util.ArrayList;
import java.util.HashSet;

public class RemDupStr {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		int cont = 0;
		HashSet set = new HashSet();
		String str = "abcab";
		for (int i = 0; i < str.length(); i++) {

			char pp = str.charAt(i);

			boolean add = set.add(pp);
			if (add == false) {

				cont++;
			}

		}
		System.out.println(set);
		System.out.println(cont);

	}
}