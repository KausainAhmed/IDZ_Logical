package com.logical;

public class Inher {
int a=10;
}
class B extends Inher {
	int b=20;
	}
class Test2 extends B{
	public static void main(String[] args) {
		Test2 t=new Test2();
		System.out.println(t.a);
		System.out.println(t.b);
	}
}