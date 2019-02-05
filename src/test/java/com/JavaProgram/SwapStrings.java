package com.JavaProgram;

public class SwapStrings {
	
	
	public static void main(String[] args) {
		String s1="HelloA";
		String s2="Nayeem";
		System.out.println("Before Swap");
		System.out.println("s1="+s1);
		System.out.println("s2="+s2);
		System.out.println("After Swap");
		s1=s1+s2;
		s2=s1.substring(0,s1.length()-s2.length());
		s1=s1.substring(s2.length());
		System.out.println("s1="+s1);
		System.out.println("s2="+s2);
		String str="Nayeem John";
		System.out.println(str.substring(0, 5));
	}

}
