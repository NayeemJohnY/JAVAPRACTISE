package com.JavaProgram;

public class Palindrome {

	public static boolean checkPalindrome(int num) {
		int temp = num;
		int r, sum = 0;
		while (num > 0) {
			r = num % 10;
			sum = (sum * 10) + r;
			num = num / 10;
		}
		if (temp == sum)
			return true;
		else
			return false;
	}
	
	public static void getPalindromeNumbers(int numLimit)
	{
		for(int i=0; i<=numLimit; i++)
		{
			if(checkPalindrome(i))
				System.out.print(i+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Is given number is Palindrome "+checkPalindrome(151));
		getPalindromeNumbers(300);
	}

}
