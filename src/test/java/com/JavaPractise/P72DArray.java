package com.JavaPractise;

public class P72DArray {
	
	public static void main(String[] args) {
		
		String  x[][]= new String [2][3];
		System.out.println(x.length);// return total no of rows
		System.out.println(x[0].length);// to no of columns
		
		
		x[0][0]="00";
		x[0][1]="01";
		x[0][2]="02";
		
		x[1][0]="10";
		x[1][1]="11";
		x[1][2]="12";
		
		for(int i=0; i<x.length; i++)// i=row
		{
			System.out.println();
			for(int j=0; j<x[0].length;j++)// j=columns	
																																																																																																																																																																																		
			System.out.print(x[i][j]+" ");
		}
			
		
	}

}
