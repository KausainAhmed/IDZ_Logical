package com.logical;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;

		// declaring array
		System.out.println("Enter number of elements you want to store");
		n = sc.nextInt();
		int arr1[] = new int[n];
		int arr2[] = new int[n];
		int sum[] = new int[n];

		// initializing array
		System.out.println("Enter values for array1");
		for (int i = 0; i < n; i++) {
			arr1[i] = sc.nextInt();
		}
		System.out.println("Enter values for array2");
		for (int i = 0; i < n; i++) {
			arr2[i] = sc.nextInt();
		}
		// printing array
		System.out.println("Elements of array 1 are");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		System.out.println("Elements of array 2 are");
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
		// sum of array
		for (int i = 0; i < sum.length; i++) {
			sum[i] = arr1[i] + arr2[i];
			
		}
		System.out.print("Sum of array is " +Arrays.toString(sum));
	}
}
