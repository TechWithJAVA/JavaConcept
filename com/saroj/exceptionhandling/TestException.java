package com.saroj.exceptionhandling;

public class TestException {
public static void main(String[] args) {
	System.out.println(m1());
}
	public static  int m1() {

	int result=0;
	try{
	result=10/0;
	return result;
	}catch(Exception e){
	return -1;
	}finally{
	return 1;
	}
	}
}
