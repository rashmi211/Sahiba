package logicCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class CWR_ArrayList {
	public static void main(String[] args) {
		//duplicate value are stored
		//can store any no of null value
		//store value on index base
		//value of insertion maintained
		//default capacity 10
		//incremental capacity=cureent capacity*3/2+1
		//best choice for retrival of data i.e data fetching (random access interface implemented in arraylist & vector)
		//worst choice for manipulate/update the data i.e insertion in between arrylist and deletion of data
		//data structure is "resizable"
		
		ArrayList arl=new ArrayList();
		arl.add(20);
		arl.add("String");
		arl.add('a');
		arl.add(null);
		arl.add(5.5f);
		
		System.out.println(arl);	
		
		System.out.println(arl.size());
	   
		arl.add(2, 'c');//when u add any info right shift peration will perform 
	    System.out.println(arl);
		
		System.out.println(arl.contains('a'));
		
		System.out.println(arl.get(3));
		
		System.out.println(arl.indexOf(null));
		
		
		System.out.println(arl.isEmpty());
		
		arl.remove(4);//when you remove info left shift operation will happen
		System.out.println(arl);
		
		arl.set(1, "Rashmi");
		System.out.println(arl);
	
		System.out.println("Print info by using for loop");
		for(int i=0; i<arl.size(); i++) {
			System.out.println(arl.get(i));
		}

		
		System.out.println("Print info by using iterator");
		Iterator itr=arl.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
	
		System.out.println("Print info by using listiterator");
		ListIterator litr=arl.listIterator();
		while(litr.hasNext()) {
			System.out.println(litr.next());
			
		}
		
		System.out.println("Print info by using for each loop");
		for(Object o: arl) {
			System.out.println(o);
		}
		
		
		
	}
	

}
