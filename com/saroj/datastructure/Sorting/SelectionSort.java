package com.saroj.datastructure.Sorting;

import java.util.Arrays;
import java.util.List;

public class SelectionSort {

	public static void main(String[] args) {
		Integer arr[]= {12,34,1,3,45};
		int n=arr.length;
		for(int i=0;i<n-1;i++) {
			int min_index=i;
			for(int j=i+1;j<n;j++) {
				if(arr[j]<arr[min_index])
					min_index=j;
			}
			//swap the found the minimum element with the first
			int temp=arr[min_index];
			arr[min_index]=arr[i];
			arr[i]=temp;
			
			
		}
		List<Integer> l=Arrays.asList(arr);
			System.out.println(l);
		}
}
