package Inheritance;

public class Multiplication 
{
	Multiplication()
	{
		System.out.println("multiplication of 5 numbers");
	}
	Multiplication(int a, int b)
	{
		this("swati");
		System.out.println("multiplication of 1 numbers");
	}
	Multiplication(String s)
	{
		this();
		System.out.println("multiplication of 2 numbers");
	}
	public static void main(String[] args) 
	{
		new Multiplication(100,200);
	}
}
