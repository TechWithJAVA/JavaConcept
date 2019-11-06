package com.saroj.opps;

public class TestHashMapObject {

	public static void main(String[] args) {
		
		Student s=new Student();
		s.setId(1);
		s.setName("saroj");
		Student s1=new Student();
		s1.setId(1);
		s1.setName("saroj");
		
		System.out.println(s.hashCode()==s1.hashCode());
	}
}
