package com.JavaProgram;

public class P6StringManiExp {
	
	public static void main(String[] args) {
		
		String s1="Test123Test534";
		
		s1=s1.replaceAll("[^0-9]", "");
			System.out.println(s1);
			Long num= Long.parseLong(s1);
			long sum=0;
			while(num>0)
			{
			  sum+=num%10;
			  num/=10;
			}
		System.out.println(sum);
	}

}
