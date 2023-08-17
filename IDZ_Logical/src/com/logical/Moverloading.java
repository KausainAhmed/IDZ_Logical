package com.logical;

public class Moverloading {
	void m1(int a) {
		System.out.println("In m1");
	}

	void m1(float a) {
		System.out.println("In m2");
	}

	public static void main(String[] args) {
		Moverloading x = new Moverloading();
		x.m1(3.5f);
	}
}

class Coverloading {
	public Coverloading(int a) {
		System.out.println("Int");
	}

	public Coverloading(float a) {
		System.out.println("Float");
	}

	public static void main(String[] args) {
		Coverloading x = new Coverloading(3.6f);
	}
}
