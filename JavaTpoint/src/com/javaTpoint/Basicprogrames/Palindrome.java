package com.javaTpoint.Basicprogrames;

public class Palindrome 
{
	public static void main(String[] args) 
	{
		int num=454;
		int rem,temp,sum=0;
		temp = num;
		while(num>0)
		{
		rem = num%10;
		sum = (sum*10)+rem;
		num = num/10;
		}
		if(temp==sum)
		{
			System.out.println("It is a palindrome");
		}
		else
		{
			System.out.println("It is not a palindrome");
		}
		
	}
}
