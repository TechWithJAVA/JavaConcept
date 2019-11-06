package com.saroj.pratice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class SortingArrayEx {

	public static void main(String[] args) {
		
		int []arr= {1,0,1,1,0,1,0,0};
		
		List<Integer> list =  Arrays.stream(arr).boxed().collect(Collectors.toList());
		
		List<Integer> collectone = list.stream().filter(n->n==1).collect(Collectors.toList());
		List<Integer> collectzero = list.stream().filter(n->n==0).collect(Collectors.toList());
		 List<List<Integer>> listOfListofInts = 
	                Arrays.asList(collectone, collectzero); 
		 System.out.println("The Structure before flattening is : " + 
                 listOfListofInts);
		// Using flatMap for transformating and flattening. 
	        List<Integer> listofInts  = listOfListofInts.stream()
	                                    .flatMap(l -> l.stream()) 
	                                    .collect(Collectors.toList()); 
	        listofInts.forEach(x->System.out.print(x+" "));
	      
	/*	collectone.addAll(collectzero);
		collectone.forEach(n->System.out.print(n+" "));*/
			
		 System.out.print("\n");	
		int count=0;//counts the number of zero
	  for(int i=0;i<arr.length;i++) {
		   if(arr[i]==1)
			   count++;
	  }
	  
	  for(int i=0;i<count;i++) {
		  arr[i]=1;
	  }
	  for(int i=count;i<arr.length;i++) {
		  arr[i]=0;
	  }
	  for (int i = 0; i <arr.length; i++) 
		 
          System.out.print(arr[i] + " "); 
	}
}
