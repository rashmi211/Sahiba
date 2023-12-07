package logicCollection;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class CWR_Vector {
	public static void main(String[] args) {
	        //duplicate value are stored
			//can store any no of null value
			//store value on index base
			//value of insertion maintained
			//default capacity 10
			//incremental capacity=cureent capacity*2
			//best choice for retrival of data i.e data fetching (random access interface implemented in arraylist & vector)
			//worst choice for manipulate/update the data i.e insertion in between arrylist and deletion of data
			//data structure is "doubly"
	        //vector is a legally class 
		
		 Vector v=new Vector();
			v.add(20);
			v.add("String");
			v.add('a');
			v.add(null);
			v.add(5.5f);
			
			System.out.println(v);	
			
			System.out.println(v.size());
		   
			v.add(2, 'c');//when u add any info right shift peration will perform 
		    System.out.println(v);
			
			System.out.println(v.contains('a'));
			
			System.out.println(v.get(3));
			
			System.out.println(v.indexOf(null));
			
			
			System.out.println(v.isEmpty());
			
			v.remove(4);//when you remove info left shift operation will happen
			System.out.println(v);
			
			v.set(1, "Rashmi");
			System.out.println(v);
			
			
			System.out.println(v.capacity());
		
			System.out.println("Print info by using for loop");
			for(int i=0; i<v.size(); i++) {
				System.out.println(v.get(i));
			}

			
			System.out.println("Print info by using iterator");
			Iterator itr=v.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
				
			}
		
			System.out.println("Print info by using listiterator");
			ListIterator litr=v.listIterator();
			while(litr.hasNext()) {
				System.out.println(litr.next());
				
			}
			
			System.out.println("Print info by using for each loop");
			for(Object o: v) {
				System.out.println(o);
			}
			
			System.out.println("Print info by using for enumeration");
			
			Enumeration enm=v.elements();
			while(enm.hasMoreElements()) {
				System.out.println(enm.nextElement());
			}
			
	
	}
}
