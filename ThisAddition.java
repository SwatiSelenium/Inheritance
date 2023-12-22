package Inheritance;

public class ThisAddition 
{
	ThisAddition(int d)
	{
		System.out.println("Addition of 2 numbers");
	}
	ThisAddition(int a, int b)
	{
		this(10);
		int c= a+b;
		System.out.println(c);
	}
	public static void main(String[] args) 
	{
		new ThisAddition(100,200);
	}
}
