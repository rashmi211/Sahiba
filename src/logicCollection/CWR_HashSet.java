package logicCollection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class CWR_HashSet {
	public static void main(String[] args) {
		
		//doesnt add duplicate value
		//order of insertion not maintained
		//storage type =hashtable
		//allow only one null value
		//no any default capacity
		
		HashSet hst=new HashSet();
		System.out.println(hst.size());
	
		hst.add(null);
		hst.add("abc");
		hst.add(12);
		hst.add('a');
		hst.add(5.05f);
		hst.add(null);
		hst.add(12);
		System.out.println(hst);
		
		System.out.println(hst.isEmpty());
		System.out.println(hst.contains(null));
	
		System.out.println(hst.remove("abc"));
		System.out.println(hst);
	
	    System.out.println("Print info by using iterator");
	    Iterator itr=hst.iterator();
	     while(itr.hasNext()) {
	    	 System.out.println(itr.next());
	     }
	     
	     System.out.println("Print info by using for each loop ");
	    for(Object o:hst) {
	    	System.out.println(o);
	    }
	    
	    ArrayList al=new ArrayList(hst);
	   
	    System.out.println(al);
	    
	    
	}

}
