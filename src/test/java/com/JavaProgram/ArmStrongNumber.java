package com.JavaProgram;

public class ArmStrongNumber {

	public static boolean checkArmStrongNumber(int num) {
		int temp = num;
		int sum = 0, r = 0, digit = 0;

		while (temp > 0) {
			temp = temp / 10;
			digit++;
		}
		
		//for digit using string concat &length
	//digit=(num+ "").length();
		temp = num;
		while (num > 0) {
			r = num % 10;
			num = num / 10;
			sum = sum + power(r, digit);

			// Math.pow(int a, int b)
		}

		if (temp == sum)
			return true;
		else
			return false;
	}

	public static int power(int number, int pow) {
		int powedr = 1;

		for (int i = 1; i <= pow; i++) {
			powedr = powedr * number;
		}

		return powedr;
	}

	public static void getcheckArmStrongNumber(int numberLimit)
	{
		for(int i=0; i<numberLimit; i++)
		{
			if(checkArmStrongNumber(i))
			{
				System.out.print(i+" ");
			}
		}
	}
	public static void main(String[] args) {

		System.out.println("The given Number is Armstrong? " + checkArmStrongNumber(153));
		// 27+125+1=3
		getcheckArmStrongNumber(600);
	}

}
