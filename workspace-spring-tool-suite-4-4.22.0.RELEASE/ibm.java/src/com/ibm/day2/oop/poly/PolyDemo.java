package com.ibm.day2.oop.poly;

public class PolyDemo 
{
	

		public static void main(String[] args) 
		{

			CalcDemo calc = new CalcDemo();
			System.out.println(calc.addNums(10, 20));
			System.out.println(calc.addNums(10, 20, 30));

		}

	
}