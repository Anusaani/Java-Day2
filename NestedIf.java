package com.anpc8232.day1;

public class NestedIf
{
	public static void main(String[] args)
	{
		int number=50;
		if(number<=10)
		{
			if(number==5)
			{
				System.out.println("Number is equal to 5 ");
			}
			else
			{
				System.out.println("Number is not equal to 5");
			}
		}
		else
		{
			System.out.println("Number is greater than 10");
		}
	}

}
