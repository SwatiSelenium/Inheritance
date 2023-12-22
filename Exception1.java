package Inheritance;

public class Exception1 
{
	
	public static void main(String[] args) 
	{
		try
		{
			int a=1/0;
			System.out.println("Try Block");
		}
		catch(ArithmeticException a1)
		{
			System.out.println("Handled AE 1");
		}
		catch(NullPointerException a2)
		{
			System.out.println("Handled AE 2");
		}
		finally
		{
			System.out.println("No matter what i am always there");
		}
	
	}

}
