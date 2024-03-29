package com.saroj.datastructure.Sorting;

public class LinkedList {

	Node head;
	
	public static LinkedList insert(LinkedList list,int data) {
		
		Node new_node=new Node(data);
		new_node.next=null;
		
		if(list.head==null) {
			list.head=new_node;
		}else {
			Node last=list.head;
			
			while(last.next!=null) {
				last=last.next;
			}
			last.next=new_node;
		}
		return list;
	}
	
	// **************TRAVERSAL************** 
	public static void printList(LinkedList list) {
		Node curr_node=list.head;
		while(curr_node!=null) {
			System.out.println(curr_node.data+" ");
			
			curr_node=curr_node.next;
		}	
		 System.out.println("\n"); 
	} 
	
	// **************DELETION BY KEY************** 
	 public static LinkedList deleteByKey(LinkedList list, int key) 
	    {
		// Store head node 
	        Node currNode = list.head, prev = null; 
	        // 
	        // CASE 1: 
	        // If head node itself holds the key to be deleted 
	        if (currNode != null && currNode.data == key) { 
	            list.head = currNode.next; // Changed head 
	  
	            // Display the message 
	            System.out.println(key + " found and deleted"); 
	  
	            // Return the updated List 
	            return list; 
	        } 
	        
	     // 
	        // CASE 2: 
	        // If the key is somewhere other than at head 
	        // 
	  
	        // Search for the key to be deleted, 
	        // keep track of the previous node 
	        // as it is needed to change currNode.next 
	        while (currNode != null && currNode.data != key) { 
	            // If currNode does not hold key 
	            // continue to next node 
	            prev = currNode; 
	            currNode = currNode.next; 
	        } 
	        
	        // If the key was present, it should be at currNode 
	        // Therefore the currNode shall not be null 
	        if (currNode != null) { 
	            // Since the key is at currNode 
	            // Unlink currNode from linked list 
	            prev.next = currNode.next; 
	  
	            // Display the message 
	            System.out.println(key + " found and deleted"); 
	        } 
	        
	     // 
	        // CASE 3: The key is not present 
	        // 
	  
	        // If key was not present in linked list 
	        // currNode should be null 
	        if (currNode == null) { 
	            // Display the message 
	            System.out.println(key + " not found"); 
	        } 
	  
		 return list;
	    }
	 
	// **************DELETION AT A POSITION************** 
	  
	    // Method to delete a node in the LinkedList by POSITION 
	    public static LinkedList deleteAtPosition(LinkedList list, int index) 
	    { 
	        // Store head node 
	        Node currNode = list.head, prev = null; 
	  
	        // 
	        // CASE 1: 
	        // If index is 0, then head node itself is to be deleted 
	  
	        if (index == 0 && currNode != null) { 
	            list.head = currNode.next; // Changed head 
	  
	            // Display the message 
	            System.out.println(index + " position element deleted"); 
	  
	            // Return the updated List 
	            return list; 
	        } 
	  
	        // 
	        // CASE 2: 
	        // If the index is greater than 0 but less than the size of LinkedList 
	        // 
	        // The counter 
	        int counter = 0; 
	  
	        // Count for the index to be deleted, 
	        // keep track of the previous node 
	        // as it is needed to change currNode.next 
	        while (currNode != null) { 
	  
	            if (counter == index) { 
	                // Since the currNode is the required position 
	                // Unlink currNode from linked list 
	                prev.next = currNode.next; 
	  
	                // Display the message 
	                System.out.println(index + " position element deleted"); 
	                break; 
	            } 
	            else { 
	                // If current position is not the index 
	                // continue to next node 
	                prev = currNode; 
	                currNode = currNode.next; 
	                counter++; 
	            } 
	        } 
	  
	        // If the position element was found, it should be at currNode 
	        // Therefore the currNode shall not be null 
	        // 
	        // CASE 3: The index is greater than the size of the LinkedList 
	        // 
	        // In this case, the currNode should be null 
	        if (currNode == null) { 
	            // Display the message 
	            System.out.println(index + " position element not found"); 
	        } 
	  
	        // return the List 
	        return list; 
	    } 
	
	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		
		list=insert(list, 1);
		list=insert(list, 4);
		list=insert(list, 6);
		list=insert(list, 1);
		list=insert(list, 8);
		list=insert(list, 2);
		
		printList(list);
		
		deleteByKey(list, 1);
		
		printList(list); 
		
		deleteByKey(list, 10); 
		
		deleteAtPosition(list, 0); 
		  
        printList(list); 
	}
}

class Node{
	
	int data;
	
	Node next;
	
	Node(int d){
		data=d;
		next=null;
	}
}
