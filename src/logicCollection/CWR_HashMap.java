package logicCollection;

import java.util.*;

public class CWR_HashMap {
	public static void main(String[] args) {
		//country,population
		
		HashMap<String,Integer> hm=new HashMap<>();
		System.out.println(hm.size());
		
		hm.put("India", 120);
		hm.put("US", 50);
		hm.put("China", 130);
		System.out.println(hm);
		
		hm.put("China", 170);
		System.out.println(hm);
		
		hm.put(null, null);
		
		
		
		//search
		System.out.println(hm.containsKey("India"));//for existing key
		System.out.println(hm.containsKey("Netherland"));//for new key
		

		//to get the value for key
		System.out.println(hm.get("China"));
		System.out.println(hm.get("Netherland"));//for new key
		
	
	int arr[]= {12,14,20};	
	
	for(int i=0; i<3; i++) {
		System.out.println(arr[i]);
	}
	
	
	for(int val : arr) {
		System.out.println(val+ " ");
	}
	
	for(Map.Entry<String,Integer>e: hm.entrySet()) {
	      System.out.println(e.getKey());
	      System.out.println(e.getValue());
	
	}

}}
