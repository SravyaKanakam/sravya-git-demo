package exception;

public class checkedexc 
{
	public static void main(String[] args)
	{

		System.out.println("One");

		try
		{
			Thread.sleep(5000);
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}

		System.out.println("Two");

	}


}
