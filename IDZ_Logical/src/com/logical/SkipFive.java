package com.logical;

public class SkipFive {
public static void main(String[] args) {
	int l=0;
	for(int i=1;i<=30;i++) {
		l++;
		if (i%2!=0 && i%5==0) {
			continue;
		}else
		System.out.println(i);
	  }
}
}
