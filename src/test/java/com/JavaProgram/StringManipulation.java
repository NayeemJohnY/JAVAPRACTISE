package com.JavaProgram;

public class StringManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str= "Java Maniuplation method avail in JAVA";
		
		System.out.println(str.length());
		System.out.println(str.charAt(5));
		System.out.println(str.indexOf("d"));
		System.out.println(str.indexOf("J", str.indexOf("J")+1));
		System.out.println(str.indexOf("a",str.indexOf("a", str.indexOf("a")+1)+1));
		System.out.println(str.indexOf("avail"));
		System.out.println(str.indexOf("Hello"));// String not avail
		
		String str1= "java Maniuplation method avail in JAVA";
		System.out.println(str.equals(str1));// boolean retruns
		System.out.println(str.equalsIgnoreCase(str1));
		System.out.println(str.substring(str.indexOf("m"),str.indexOf("A")));
		String s2="   Hello World ";
		System.out.println(s2.trim());//before and after space
		s2="10-02-2017";
		System.out.println(s2.replaceAll("-", "/"));
		s2="Hello_World_of_Selenium";
		String a[]= s2.split("_");
		for(String b:a)
		{
			System.out.println(b);
		}
		

	}

}
