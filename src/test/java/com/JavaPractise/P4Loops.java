package com.JavaPractise;

public class P4Loops {
	
	public static void main(String[] args) {
		
		//while loop -entry cntrol loop
		int i=0;//<-- initialization 
		while(i<=10)//<-- conditional 
		{
			System.out.println(i);
			i++;//<-- incremental/decremental 
		}
		
		// exit control loop continue if c=Y
		char c='N';
		do {
			System.out.println(c);
		}while(c=='Y');
		
		// for loop 
		
		for (int j=0; j<10; j++)
		{
			System.out.println(j);
		}
	}
	
	

}
