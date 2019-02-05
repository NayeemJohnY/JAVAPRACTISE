package com.JavaProgram;

public class PrimeNumber {
	
	public static boolean checkPrimeNumber(int num)
	{
		if (num<=1)
			return false;
		
		for(int i=2; i<=num/2; i++)
			if(num%i==0)
		{
			return false;
		}
		return true;
	}
	public static void  getPrimeNumber(int numLimit)
	{
		for(int i=2; i<=numLimit; i++)
		{
			if(checkPrimeNumber(i)==true)
			{
				System.out.print(i+" ");
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("IS given Number is Prime "+checkPrimeNumber(15));
		System.out.println("IS given Number is Prime "+checkPrimeNumber(13));
		System.out.println("IS given Number is Prime "+checkPrimeNumber(0));
		getPrimeNumber(100);
	}

}
