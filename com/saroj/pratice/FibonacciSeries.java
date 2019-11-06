package com.saroj.pratice;

public class FibonacciSeries {

	
	public static void main(String[] args) {
		
		int n=10,t1=0,t2=1;
		
		for(int i=0; i<=n; i++){
            System.out.print(fibonacci(i) +" ");
        }
		
		/*for(int i=0;i<10;++i) {
			
			System.out.print(t1+" ");
			int sum=t1+t2;
			t1=t2;
			t2=sum;
		}*/
		/*int i=1;
		while( i<=n) {
			System.out.print(t1+" ");
			int sum=t1+t2;
			t1=t2;
			t2=sum;
			i++;
		}*/
	}

	private static int fibonacci(int n) {
		if(n==0)
			return 0;
		if(n == 1 || n == 2){
            return 1;
        }
		 return fibonacci(n-1) + fibonacci(n -2);
	}
}
