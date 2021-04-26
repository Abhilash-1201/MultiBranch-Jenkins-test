package com.javaTpoint.Basicprogrames;

public class Fibonacci 
{
	public static void main(String[] args) 
	{
		int a=0,b=1,c;
		System.out.print(a+" "+b);//0 1
		for(int i =1 ;i<=10;i++)
		{
			c = a + b;
			System.out.print(" "+c);
			a = b;
			b = c;
		}
	}
}
