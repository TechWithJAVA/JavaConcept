package com.saroj.pratice;

public class Palindrome {

	
	public static void main(String[] args) {
		int n=454,r, sum=0;
		int temp=n;
		while(n>0) {
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if(sum==temp)
			System.out.println("Pallindrome Number");
		else
			System.out.println("Not a pallindrome Number");
		
	}
}
