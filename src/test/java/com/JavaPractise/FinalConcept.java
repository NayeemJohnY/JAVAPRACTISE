package com.JavaPractise;

import java.util.concurrent.SynchronousQueue;

public class FinalConcept {
	
	public static void main(String[] args) {
		final int i=20;//constant value cannot be changed
		// to prevent the inheriatnce to prevent method overriding
		/*i=60;
		i=40;*/
		
		System.out.println(i);
	}

}
