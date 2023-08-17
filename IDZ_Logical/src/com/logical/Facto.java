package com.logical;

//Using Method
public class Facto {
	public static int Fact(int num) {
		int fact = 1;
		for (int i = num; i > 0; i--) {
			fact = fact * i;
		}
		return fact;
	}

	public static void main(String[] args) {
		System.out.println(Fact(5));
	}
}

//Using Recursion
class RecFact {
	public static int RecFacto(int num) {
		if (num == 0) {
			return 1;
		}
		return num * RecFacto(num - 1);
	}

	public static void main(String[] args) {
		System.out.println(RecFacto(4));
	}
}