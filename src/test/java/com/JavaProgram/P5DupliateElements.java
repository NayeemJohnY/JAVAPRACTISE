package com.JavaProgram;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class P5DupliateElements {
	
	//method 1
	public static void duplicate(String a[])
	{
		for(int i= 0 ;i<a.length; i++)
		{
			for(int j=i+1;j<a.length; j++)
				if(a[i].equals(a[j]))
					{
				System.out.println("Duplicate Elements= "+a[i]);
					}
		}
	}
	//method 2
	public static void duplicateSet(String a[])
	{
		Set<String> s= new HashSet<String>();
		for(String cont:a)
		{
			if(s.add(cont)==false)
			{
				System.out.println("Duplicate Elements= "+cont);
			}
		}
	}
	//method 3..
	public static void duplicateMap(String a[])
	{
		Map<String,Integer> hs= new HashMap<String,Integer>();
		for(String name: a)
		{
			Integer count=hs.get(name);
			if(count==null)
			{
				hs.put(name, 1);
			}
			else
				hs.put(name, ++count);
		}
		
		Set<Entry<String,Integer>> entryset= hs.entrySet();
		for(Entry<String, Integer> e:entryset)
		{
			if(e.getValue()>1)
			{
				System.out.println("duplicate values="+e.getKey());
			}
		}
	}
	
	public static void main(String[] args) {
		String [] a={"Nayeem", "Java", "Dare","Java"};
//		duplicate(a);
		String [] b={"Nayeem", "Java", "Dare","Java", "C", "C++", "C"};
//		duplicate(b);
		/*duplicateSet(a);
		duplicateSet(b);*/
		duplicateMap(b);
	}

}
