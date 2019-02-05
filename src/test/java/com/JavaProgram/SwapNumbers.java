package com.JavaProgram;

public class SwapNumbers {
	public static void  swap(int a, int b)
	{
		 
		 int temp=a;
		 a=b;
		 b=temp;
		 System.out.println("a is="+a);
		 System.out.println("b is="+b);
		 
		 
	}
	public static void swapAdd(int a, int b)
	{
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a is="+a);
		 System.out.println("b is="+b);
	}
	
	public static void swapMult(int a, int b)
	{
		a=a*b;
		b=a/b;
		a=a/b;
		System.out.println("a is="+a);
		 System.out.println("b is="+b);
	}
	
	public static void swapXor(int a, int b)
	{// a=2--> 010 b =4--> 100
		a=a^b; //===> a= 110 =6
		b=a^b;// ===>b=110^100=010=2=value of a
		a=a^b;//===>a=110^010= 100=4- value of b
		System.out.println("a is="+a);
		 System.out.println("b is="+b);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		swap(10, 20);
		swapAdd(10,20);
		swapMult(10,20);
		swapXor(2,4);
	}
	

}
