package com.OOPsConcept1;

public class WrapperClass {

	// Data conversion

	public static void main(String[] args) {

		String a = "100";
		System.out.println(a + 20);
		// data conversion String to int
		int x = Integer.parseInt(a);
		System.out.println(x + 20);
		
//Integer ,Double,Character, Boolean
		String b="12.23";
	System.out.println(b + 20);
		double y = Double.parseDouble(b);
		System.out.println(y + 20);
		
		String c="true";
		boolean z= Boolean.parseBoolean(c);
		System.out.println(z);
		
		// int tp string
		int i=100;
		System.out.println(i+20);
		String s=String.valueOf(i);
		System.out.println(s+20);
		/*// number format exception
		String u="A100";
		Integer.parseInt(u);*/
		
		int l=10;
		float k=l;
		System.out.println(k);
		l=(int) (k+10.99);//up cast
		System.out.println(l);
		
		
		int m=72;
		char n=(char) m;
		System.out.println(n);
		
		int p=n;
		System.out.println(p);
	}

}
