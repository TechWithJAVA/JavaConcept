package com.saroj.stringhandling;

public class CharactersNumericPosition {

	
	public static void main(String[] args) {
		String s="Saroj";
		
		char []arr=s.toUpperCase().toCharArray();
		
		for(char input:arr) {
			System.out.println((int)input-(int)'A'+" ");
		}
		System.out.println("*************************");
		s.toLowerCase().chars().mapToObj(e->e-97).forEach(e->System.out.println(e+" "));
	}
}
