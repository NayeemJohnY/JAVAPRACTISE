package com.OOPsConcept2;

public class BMW extends Car{
	
	public void start()// when same method in  parent class & class methods wirh same name and same arguments 
	{
		System.out.println("BMW---start");
	}
	

	public void threadsafety()
	{
		System.out.println("BMW---threadsafety");
	}

}
