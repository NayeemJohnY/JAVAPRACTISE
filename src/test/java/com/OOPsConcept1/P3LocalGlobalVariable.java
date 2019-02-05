package com.OOPsConcept1;

public class P3LocalGlobalVariable {
	
	String name="Nayeem";
	int age=10;//global variable or class
	public static void main(String[] args) {
		int i=5;//local variable
		System.out.println(i);
		P3LocalGlobalVariable obj= new P3LocalGlobalVariable();
		System.out.println(obj.name);
		System.out.println(obj.age);
	}
	public void sum()
	{
		int k=10;// local variable cant acces that i in this Since thescope with that method
		age=24;
	}

}
