package com.saroj.stringhandling;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;


public class StringOcurrence {

	

	public static void main(String[] args) {
		String occ="Its time to learn, better to understand";
		String []s=occ.split(" ");
		Map<String,Integer> m=new HashMap<>();
		for(String str:s) {
			if(m.containsKey(str)) {
				m.put( str,m.get(str)+1);
			}else
				m.put(str,1);
			
		}
	//	System.out.println(m);
		
		m.entrySet().stream().forEach(x->System.out.println(x.getKey()+"****"+x.getValue()));
		
		// Using Stream Package (Stream Interface and Collectors class)
		List<String> sl=Arrays.asList(s);
		Map<String, Long> wordsCount = sl.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(wordsCount);
		
		
		Map<Character,Integer> m1=new HashMap<>();
		char []c=occ.toCharArray();
		for( char c1:c) {
			if(m1.containsKey(c1)) {
				m1.put(c1,m1.get(c1)+1);
			}else
				m1.put(c1,1);
		}
		System.out.println(m1);
		
		// Using Stream Package (Stream Interface and Collectors class)
	
		List<Character> cl = occ.chars().mapToObj(e -> (char) e).collect(Collectors.toList());
		Map<Character, Long> charCount = cl.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(charCount);
	}
}
