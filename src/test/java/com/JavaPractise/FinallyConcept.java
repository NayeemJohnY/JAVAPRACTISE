package com.JavaPractise;

public class FinallyConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 //test1();
 div();
 
	}
	public static void test1()
	{
		try{
			System.err.println("inside try method");
			throw new RuntimeException("test");
		}
		catch(Exception e)
		{
			System.err.println("inside catch  method");
		}
		
		finally// will be executed always
		{
			System.err.println("inside finally");
		}
	}
public static void div()
{
	int i=10;
	try{
		System.out.println("try");
		int k=i/0;
	}
	catch(NullPointerException e)
	{
		System.out.println("catch");
	}
	finally{
		System.out.println("finally");
	}
}
}
