package Sravya;
import java.util.*;
public class B extends A//inheritance
{
	int m1(int a)//method overriding
	{
		super.m1(20);
		System.out.println(a);
		return a;
	}
	String m2(String x)
	{
		System.out.println(x);
		return x;
	}
	public static void main(String args[])
	{
		
		B x=new B();
		x.m2("88");
		x.m1(10);
	}
}
