package com.Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LInkedListConcept {

	public static void main(String[] args) {
		 LinkedList<String> l= new LinkedList<String>();
		 
		 l.add("test");
		 l.add("qtp");
		 l.add("selenium");
		 l.addFirst("Nayeem");
		 l.addLast("John");
		 System.out.println(l);
		 System.out.println(l.get(0));
		 l.set(2, "QTP Tool");
		 System.out.println(l);
		 l.removeLast();
		 l.remove(1);
		 System.out.println(l);
		 Iterator<String> it=l.iterator();
		 while(it.hasNext())
		 {
			 System.out.println(it.next());
		 }
		 
	}

}
