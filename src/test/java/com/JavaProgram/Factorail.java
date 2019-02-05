package com.JavaProgram;

public class Factorail {
	
	public static int factorial(int num)
	{int fact=1;
	if(num==0)
		return 1;
		for(int i=1; i<=num; i++)
		{
			fact=fact*i;
		}
		return fact;
	}
	
	public static int factRec(int num)
	{
		
		if(num==0)
			return 1;
		return(num*factRec(num-1));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(factorial(5));
		System.out.println(factRec(5));
	}

}
