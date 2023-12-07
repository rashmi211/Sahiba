package logicCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class CWR_LinkedList {
public static void main(String[] args) {
	         //duplicate value are stored
			//can store any no of null value
			//store value on index base
			//value of insertion maintained
			//No default capacity
			//
			//worst choice for retrival of data i.e data fetching 
			//best choice for manipulate/update the data i.e insertion in between linkedlist and deletion of data
			//data structure is "linear"
			//there no life or right shift happen in linked list
	
			LinkedList lst=new LinkedList();
			lst.add(20);
			lst.add("String");
			lst.add('a');
			lst.add(null);
			lst.add(5.5f);
			lst.add(null);
			
			System.out.println(lst);	
			
			System.out.println(lst.size());
		    
			lst.add(2, 'c');
		    System.out.println(lst);
			
			System.out.println(lst.contains('a'));
			
			System.out.println(lst.get(3));
			
			System.out.println(lst.indexOf(null));
			
			
			System.out.println(lst.isEmpty());
			
			lst.remove(4);
			System.out.println(lst);
			
			lst.set(1, "Rashmi");
			System.out.println(lst);
		
			System.out.println("Print info by using for loop");
			for(int i=0; i<lst.size(); i++) {
				System.out.println(lst.get(i));
			}

			
			System.out.println("Print info by using iterator");
			Iterator itr=lst.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
				
			}
		
			System.out.println("Print info by using listiterator");
			ListIterator litr=lst.listIterator();
			while(litr.hasNext()) {
				System.out.println(litr.next());
				
			}
			
			System.out.println("Print info by using for each loop");
			for(Object o: lst) {
				System.out.println(o);
			}
		

}
}
