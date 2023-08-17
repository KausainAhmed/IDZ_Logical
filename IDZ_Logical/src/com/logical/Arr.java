package com.logical;

import java.util.Arrays;

public class Arr {
	public static void main(String[] args) {
		int[] arr = { 2, 5, 1, 8, 3, 7 };
		Arrays.sort(arr);

		int l = arr.length;
		System.out.println("Largest of array is " + arr[l - 1]);
	}
}

class Arr1 {
	public static void main(String[] args) {
		int max = 0;
		int[] arr = { 3, 5, 8, 1, 2, 7 };
		// max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("Largest of number is " + max);
	}
}

class LarArr {
	static int max = 0;

	public static int Demo(int[] a) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		int[] abc = { 3, 2, 8, 4, 6 };
		System.out.println(Demo(abc));
	}
}

class ObjArr {
	public static void main(String[] args) {
		Object[] op = { "Arjun", 12, "golu", 2.45f };
		for (int i = 0; i < op.length; i++) {
			System.out.println(op[i]);
		}
	}
}
