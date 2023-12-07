package logicCollection;

import java.util.HashMap;
import java.util.Hashtable;

public class CWR_HashTable {
	public static void main(String[] args) {
		Hashtable<String,Integer> hm=new Hashtable<>();
		System.out.println(hm.size());
		
		
		hm.put("Rashmi", 10);
		hm.put("Shruti", 100);
		hm.put("Rani", 15);
		hm.put("Kartik", 20);
		hm.put("Varun", 13);
		hm.put(null, null);
		
		System.out.println(hm);
		
	}

}
