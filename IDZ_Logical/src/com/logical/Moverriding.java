package com.logical;

 class Moverriding {
void m1() {
	System.out.println("Parent m1");
}
}
class Test extends Moverriding{
	void m1() {
		System.out.println("Child m1");
	}
	public static void main(String[] args) {
		
	Moverriding t=new Test();
	t.m1();
}}




