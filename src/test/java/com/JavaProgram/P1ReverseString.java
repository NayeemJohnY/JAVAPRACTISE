package com.JavaProgram;

public class P1ReverseString {

	public static void main(String[] args) {
		//Method 1
		String s1 = "Nayeem";
		
		String rev="";
		
		for (int i = (s1.length())-1; i>=0; i--)
		{
			rev=rev + s1.charAt(i);
			
		
		}
		System.out.println(s1);
		System.out.println(rev);
		

		//Method 2
		StringBuffer buf = new StringBuffer(s1);		
		System.out.println(buf.reverse());

	
	// Method 3
	
	StringBuilder bul= new StringBuilder(s1);
	System.out.println(bul.reverse());
	
	}
}
