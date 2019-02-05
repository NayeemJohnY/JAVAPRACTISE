package com.JavaProgram;

import java.util.Arrays;

public class SmallestLargest {

	public static void main(String[] args) {

		int num[] = { -10, 20, 45, -456, 4444, 0 };
		int smallest = num[0];
		int largest = num[0];

		for (int i = 1; i < num.length; i++) {
			if (smallest > num[i]) {
				smallest = num[i];

			} else if (largest < num[i]) {
				largest = num[i];
			}
		}
		System.out.println("Array of numbers"+Arrays.toString(num));
		System.out.println("smallest is "+smallest);
		System.out.println("largest is "+largest);

	}

}
