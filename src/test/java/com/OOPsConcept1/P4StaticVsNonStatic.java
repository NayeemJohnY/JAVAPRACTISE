package com.OOPsConcept1;

public class P4StaticVsNonStatic {
	
	String name="Nayeem";// Non static global var
	static int age=20;//  static global var
	
	//seperate memory location for static memebrs
	//objects can acess to common memory static alcoation
	public static void main(String[] args) {
		sum(5,10);
		P4StaticVsNonStatic.sum(6, 8);//static call
		
		P4StaticVsNonStatic obj= new P4StaticVsNonStatic();
		obj.send();
		 System.out.println(age);
		 System.out.println(obj.name);
		 //can i access static method by Object reference =Yes
		 	obj.sum(5, 5);//static method warning; can be accessed static way.
	}
	
	public void send()
	
	{ 
		 System.out.println("send method");
		
	}
	
	public static void sum(int a, int b)
	{
		System.out.println("sum="+(a+b));
		System.out.println(age);
	}

}
