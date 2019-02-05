package com.Collections;

import java.util.ArrayList;

public class ArrayListConcept {
 public static  void main(String[] args) {
	 //dynamic in nature
	 ArrayList alist = new ArrayList();
	 alist.add(100);
	 alist.add(200);
	 alist.add(300);
	 
	 System.out.println(alist.size());
	 
	 alist.add(12.23);
	 
	 for (Object o:alist)
		{
			System.out.println(o);
		}
	 

	 //System.out.println(alist.get(5));
	 System.out.println("***********");
	 
	 ArrayList a2 = new ArrayList();
	 a2.add("Nayeem");
	 a2.add("John");
	 a2.add('M');
	 a2.add(12.23);
	 a2.addAll(a2);
	 alist.retainAll(a2);
	for (Object o:alist)
	{
		System.out.println(o);
	}
}
}
