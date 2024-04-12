package collections;

public interface a
{
	public abstract void m1(int a);
	
}
public class Abstractclass implements a
{
	
public void m1(int a)
{
	System.out.println(a);
	
}

public static void main(String args[])
{
	Abstractclass c=new Abstractclass();
	c.m1(10);
}
}


