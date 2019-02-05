package com.OOPsConcept1;

public class CallByReferCallByValue {
	
	int p,q;

	public static void main(String[] args) {
		CallByReferCallByValue cl= new CallByReferCallByValue();
		int x=45, y=75;
		System.out.println(cl.sum(x,y));// call by value pass value
		cl.p=11;
		cl.q=22;
		cl.swap(cl);
		System.out.println("p="+cl.p);
		System.out.println("q="+cl.q);
	}
 public int sum(int a, int b)
 { a=50;
 b=80;
	  int c=a+b;
	 return c;
 }
 
 public void swap(CallByReferCallByValue obj)//call by reference 
 
 {	int temp=obj.p;
	 obj.p=obj.q;
	 obj.q=temp;

 }
}
