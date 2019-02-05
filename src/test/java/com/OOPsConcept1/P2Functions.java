package com.OOPsConcept1;

public class P2Functions {
	// NOn Static methods
	// to access non static members need to create Object(entity)
	
	public static void main(String[] args) {
		P2Functions obj= new P2Functions();
		obj.method();
		System.out.println(obj.sum());
		obj.display("Nayeem");
		System.out.println(obj.multi(10, 6));
		//All non static methods copy given to the Obj
	}

	 public void method()// no return type no arguments
	 {
		 System.out.println("test method");
	 }
	 
	 public int sum()// return type no arguments
	 {
		 int a=10;
		 int b=20;
		 
		 return a+b;
		 
	 }
	 
	 public void display(String s)//No return type but argument
	 {
		 System.out.println(s);
	 }
	 public int multi(int a, int b)
	 {
		return a*b;
	 }
}
