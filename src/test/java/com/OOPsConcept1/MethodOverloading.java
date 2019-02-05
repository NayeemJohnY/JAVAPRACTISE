package com.OOPsConcept1;

public class MethodOverloading {
	
	//Method Overloading=same method name with different arguments with different datatype
	//you cant create a method inside method
	//dupicate methods- same method with same no of argument of same datatype is not allowed
	public static void main(String[] args) {
		MethodOverloading met= new MethodOverloading();
		met.sum();		
		met.sum(5);
		met.sum(10, 5);		
		met.sum("String");
	}
	//main method can be overloaded
	public static void main(int  a) {
		System.out.println(a);
	}
	public static void main(int a, String b) {
		System.out.println(a);
		System.out.println(b);
	}

 public void sum()// method with no parameter
 {
	 System.out.println("method with No arg");
 }
 
 public void sum(int i)// same method overloaded with parameter
 {
	 System.out.println("method with i"+i+ "arg");
 }
 
 public void sum(int i, int k)// same method overloaded with parameter
 {
	 System.out.println("method with i="+i+"k="+k+"arg");
 }
 
 public void sum(String s)// same method overloaded with parameter
 {
	 System.out.println("method overloaded with 1 Sring"+s);
 }
}
