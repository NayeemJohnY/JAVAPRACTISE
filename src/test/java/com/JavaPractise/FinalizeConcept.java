package com.JavaPractise;

public class FinalizeConcept {
	
	public void finalize()
	{
		System.out.println("final");
	}
	public static void main(String[] args) {
		
		FinalizeConcept f1= new FinalizeConcept();
		FinalizeConcept f2= new FinalizeConcept();
		
		f1=null;
		f2=null;
		//garbage collector to destory &free space memory which dont have refernce
		System.gc();
	}

}
