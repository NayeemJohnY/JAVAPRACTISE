package com.JavaProgram;

public class P3ReverseInteger {
	
	public static int reverse(int num)
	{ int rev=0;
	int r=0;
		while(num>0)
		{r= num%10;
			rev=(rev*10)+r;
			num=num/10;
			
		}
		return rev;
	}
	
	
	
	public static void main(String[] args) {
		
		System.out.println("Reverse of Number is  "+P3ReverseInteger.reverse(105));
		System.out.println(new StringBuffer(String.valueOf(58964)).reverse());
	}

}
