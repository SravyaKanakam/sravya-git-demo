package com.ibm.day2.oop;
import java.util.*;

public class ClassDemo 
{
	
		
		static int m1(double amount)
		{
			double gst=18;
			double billamount=(amount+(gst/100));
			System.out.println("total bill is:"+billamount);
			return 0;
		}
	public static void main(String args[])
	{
        Scanner sc=new Scanner(System.in);
		ClassDemo a=new ClassDemo();
		System.out.println("enter the amount");
		double amount=sc.nextDouble();
		a.m1(amount);
	}

}
