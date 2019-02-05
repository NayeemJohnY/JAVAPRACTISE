package com.OOPsConcept1;

public class Car {
	//Class- entity that have properties inform of variables & methods
	//Class Varible or Global variable
	int mod;
	int wheel;
	//Object - physical entity of class 
	public static void main(String[] args) {
		// new Car()is object -->a,b,c object reference variable
		//copy of mod , wheel given to each object
		Car a= new Car();
		Car b= new Car();
		Car c= new Car();
		a.mod=2000;
		a.wheel=4;
		b.mod=2016;
		b.wheel=4;
		c.mod=2019;
		c.wheel=6;
		System.out.println("Before Shift*******");
		System.out.println(a.mod);
		System.out.println(a.wheel);
		
		System.out.println(b.mod);
		System.out.println(b.wheel);
		

		System.out.println(c.mod);
		System.out.println(c.wheel);
		
		a=b;
		b=c;
		c=a;
		System.out.println("Before Shift*******");
		a.mod=10;
		System.out.println(a.mod);
		c.mod=20;
		System.out.println(a.mod);
		
	}

}
