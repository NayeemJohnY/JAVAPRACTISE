package com.JavaProgram;

public class P2RemoveStr {
	
	
	public static void main(String[] args) {
		String str="{*\\ Nayeem 012364569";
		//regular exp[^a-zA-Z0-9] ^ not
		
		String s =str.replaceAll("[^a-zA-Z0-9 ]", "");
		System.out.println(s);

	}
	
	
	
	
}
