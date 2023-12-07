package logicCollection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class CWR_LinkedHashSet {
	public static void main(String[] args) {
		//it doesnt allow duplicate value
		// order of insetion is maintained 
		// accept only one null value
		// storage type is hashtable
		// data structure is hybrid (hashtable + linear)
		// no default capacity
		//best for removal of data when order of inertion is mandatory
		
		
		LinkedHashSet hst=new LinkedHashSet();
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

}}
