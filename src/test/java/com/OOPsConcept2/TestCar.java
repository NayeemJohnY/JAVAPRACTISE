package com.OOPsConcept2;

public class TestCar {
	
	public static void main(String[] args) {
		BMW b= new BMW();
		
		b.start();
		b.threadsafety();
		b.refuel();
		b.stop();
		
		Car c= new Car();
		c.start();
		c.refuel();
		c.stop();
		
		Car cb= new BMW();//child class Object can be referred  by the parent class teference variaable
		cb.start();
		cb.stop();
		cb.refuel();
		
		BMW bc= (BMW)new Car();//down casring but classCastexception
		
				
	}

}
