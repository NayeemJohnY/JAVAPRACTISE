package com.Collections;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashTableConcept {
	public static void main(String[] args) {

		// simialr to hasMap synch
		// stores key & value
		// key--> object ---hashocde --->value
		// JVM provide 32 integer number -hashcode --unique
		// threadsafe
		
	//unique values

		Hashtable h = new Hashtable();
		h.put(1, 100);
		h.put("A", "456");
		h.put(null, "Asf");
		
		System.out.println(h.get("A"));

		// creta a clone copy

		System.out.println("values of h" + h);

		Hashtable h2 = new Hashtable();
		h2 = (Hashtable) h.clone();

		System.out.println("values of h2" + h2);
		System.out.println(h.equals(h2)+" Both are equal");
		h2.put("C", "String");
		System.out.println("values of h2" + h2);		
		System.out.println(h.equals(h2)+" Both are equal");
		h.clear();
		System.out.println("values of h" + h);
		System.out.println("values of h2" + h2);
		if(h2.contains("456")) 
			 System.out.println("value is found");
		System.out.println("print values enum");
		Enumeration e=h2.elements();
		
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
			
		}
		
		System.out.println("print values entry set");
		Set s= h2.entrySet();
		System.out.println(s);
		
		// get the hashcode value of 
		System.out.println("Hash code"+h2.hashCode());
	}

}
