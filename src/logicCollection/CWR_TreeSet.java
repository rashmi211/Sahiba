package logicCollection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class CWR_TreeSet {
	public static void main(String[] args) {
		//do not store duplicate value
		// do not store any null value
		// order of insertion is ascendig order
		
		
		TreeSet hst=new TreeSet();
		System.out.println(hst.size());
	
		hst.add(10);
		hst.add(50);
		hst.add(5);
		hst.add(100);
		hst.add(20);
		hst.add(15);
		hst.add(10);
		System.out.println(hst);
		
		hst.pollFirst();//delete first element from list
		System.out.println(hst);
		
		hst.pollLast();//delete last element from list
		System.out.println(hst);
		
		System.out.println(hst.first());
		System.out.println(hst.last());
		
		System.out.println("print value in descending order");
		Iterator itr=hst.descendingIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}}
