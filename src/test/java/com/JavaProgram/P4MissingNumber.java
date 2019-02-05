package com.JavaProgram;

public class P4MissingNumber {
	
	public static  void  missingnumber(int [] a)
	{
		int sum=0,total=0;
		for(int i=0; i<a.length; i++)
		{
			sum=sum+a[i];
		}
		
		for(int j=1; j<=a[a.length-1];j++)
		{ 
			
			total=total+j;
		
		}
		
		
		
		System.out.println("Missing Number is =" +(total-sum));
	}
	
	
	
	public static void main(String[] args) {
		int []a={1,2,3,4,6};
		missingnumber(a);
		int []b={2,3,4,5};
		missingnumber(b);		
		int []c={1,2,3,4,5};
		missingnumber(c);
	
		
		int []e={-1,0,2,3,4,5};
		missingnumber(e);
		
		
	}

}
