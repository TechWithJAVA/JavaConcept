package com.saroj.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class HashMaptest {

	public static void main(String[] args) {
		Map<String,String> m=new HashMap<>();
		m.put("saroj", "Yash");
		
		 List<String> result = new ArrayList(m.keySet());
		result.forEach(System.out::println);
		 List<String> resultvalues = new ArrayList(m.values());
		 resultvalues.forEach(System.out::println);
		m.forEach((k,v)->System.out.println(k+"********"+v));
		
		m.entrySet().stream().forEach(e->System.out.println(e.getKey()+"**"+e.getValue()));
		
		for(Map.Entry<String,String> entry:m.entrySet()) {
			System.out.println(entry.getKey()+"****"+entry.getValue());
		}
		
		Iterator< Map.Entry<String,String>> it=m.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry<String, String> n=it.next();
			System.out.println(n.getKey()+"*****"+n.getValue());
		}
	}
}
