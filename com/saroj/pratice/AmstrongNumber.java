package com.saroj.pratice;

public class AmstrongNumber {

	
	public static void main(String[] args) {
		
	/*	int n=153,a,c=0;
		int temp=n;
		while(n>0) {
			a=n%10;
			n=n/10;
			c=c+a*a*a;
		}
		if(temp==c)
			System.out.println("Amsrtong Number is: "+c);
		else
			System.out.println("Not a Amstrong Number");*/
		
		AmstrongNumber s=new AmstrongNumber();
		for(int num=1;num<500;num++)
		{
	    int am=s.findArmstrongNumber(num, 0);
	    if(am==num)
	    	System.out.println(am);
		}
	}
	
	//Using Recursion
	 int findArmstrongNumber(int n,int a){
		int x;
		if(n!=0) {
			x=n%10;
			a=a+x*x*x;
			n=n/10;
			return findArmstrongNumber(n, a);
		}
		return a;
	}
}
