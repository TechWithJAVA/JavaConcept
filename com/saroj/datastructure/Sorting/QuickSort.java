package com.saroj.datastructure.Sorting;

public class QuickSort {

	public static void main(String[] args) {
		
	
	 int arr[] = {10, 7, 8, 9, 1, 5}; 
     int n = arr.length; 

     QuickSort ob = new QuickSort(); 
     ob.sort(arr, 0, n-1); 

     System.out.println("sorted array"); 
     printArray(arr); 
	}

	   /* A utility function to print array of size n */
	private static void printArray(int[] arr) {

      for(int i=0;i<arr.length;i++) {
    	  System.out.print(arr[i]);
    	  System.out.println();
      }
		
	}
    /* The main function that implements QuickSort() 
    arr[] --> Array to be sorted, 
    low  --> Starting index, 
    high  --> Ending index */

	private void sort(int[] arr, int low, int high) {
		if(low<high) {
			  /* pi is partitioning index, arr[pi] is  
            now at right place */
			int pivot=partition(arr,low,high);
			
			// Recursively sort elements before 
            // partition and after partition 
			sort(arr,low,pivot-1);
			sort(arr,pivot+1,high);
		}
		
	}

	private int partition(int[] arr, int low, int high) {
		
		int pivot=arr[high];
		int i=low-1;// index of smaller element 
		for(int j=low;j<high;j++) {
			 // If current element is smaller than the pivot 
			if(arr[j]<pivot) {
				i++;
				 // swap arr[i] and arr[j] 
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		 // swap arr[i+1] and arr[high] (or pivot) 
			int temp=arr[i+1];
			 arr[i+1]=arr[high];
			 arr[high]=temp;
		
		return i+1;
	}
}
