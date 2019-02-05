package com.JavaPractise;

public class P6StaticArray {
public static void main(String[] args) {
	//similar datatype values
	//int arry
	
	// lowest bound=0
	//highest bound =n-1(n =size of array)
	
	//single dimension array
	//1.size of array is fixed--> To overcome Collections
	//2.it stores similar datatype-->To overcome we use Object array
	int [] a= new int[4];
	a[0]=10;
	a[1]=20;
	a[2]=30;
	a[3]=40;
	
	System.out.println(a);//return the address of array a
	System.out.println(a.length);//size of array
	System.out.println(a[0]);
	System.out.println(a[3]);
	//System.out.println(a[4]);//Array out of index bound exception
	
	//print all values array\
	System.out.println("**********");
	for(int av:a)
	{
		System.out.println(av);
	}
	System.out.println("**********");
	for(int b=0; b<a.length; b++)
	{
		System.out.println(a[b]);
	}
	
	System.out.println("**********");
	String[] str= new  String [2];
	str[0]="Nayeem";
			str[1]="JOhn";
			
			for(String s:str)
			{
				System.out.println(s);
			}
	Object o[]= new Object[5];//most super class
	//it is used to store the differnet datatypes in single array.
	o[0]=10;
	o[1]="Nayeem";
	o[2]=15.63;
	o[3]='C';
	o[4]=true;
	
	System.out.println("**********");
	
	
}
}
