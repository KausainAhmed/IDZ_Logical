package com.logical;

public class CallByValue {
int a=50;
public	void change(int a) {
	a=a+100;
		System.out.println(this.a);
	}
public static void main(String[] args) {
 CallByValue c=new CallByValue();
 c.change(200);
 }

}
