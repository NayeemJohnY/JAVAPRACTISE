package com.Collections;

import java.util.HashMap;
import java.util.Map;


public class MapConcept {
	
	public static void main(String[] args) {
		//HashMap implements Map
		//extends  AbstractMap
		//it contains unique elements
		// no Order
		//null values
		// non synch- not thread safe -->fail fast or  concurrent modiifcation exception 
		
		HashMap<Integer,String> m= new  HashMap<Integer,String>();
		m.put(1, "Nayeem");
		m.put(2, "John");
		m.put(-1, "QTp");
		m.put(0,"Zero");
		m.put(6,"Nayeem");
		System.out.println(m);
		System.err.println(m.get(3));
		
		for (Map.Entry e:m.entrySet())
		{
			System.out.print(e.getKey()+" ");
			System.out.println(e.getValue());
		}
		System.out.println("***********************");
		HashMap<String,String> hs= new  HashMap<String,String>();
		hs.put("Z", "Nayeem");
		hs.put("B", "John");
		hs.put("C", "QTp");
		hs.put("A","Zero");
		System.out.println(hs);

		hs.remove("B");
		System.out.println(hs.get("B"));
		for (Map.Entry e:hs.entrySet())
		{
			System.out.print(e.getKey()+" ");
			System.out.println(e.getValue());
		}
		
	}

}
