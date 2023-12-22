package Inheritance;
abstract class Physics
{
	abstract void add();
	static void substract()
	{
		int a=20;
		int b=5;
		int c=a-b;
		System.out.println(c);
	}
}
class Science extends Physics
{
	void multiply()
	{
		int a=2;
		int b=6;
		int c=a*b;
		System.out.println(c);
	}
	void add() 
	{
		int a=20;
		int b=5;
		int c=a+b;
		System.out.println(c);
	}
}
public class Maths extends Science 
{
	void divide()
	{
		int a=22;
		int b=6;
		double c=a/b;
		System.out.println(c);
	}
	public static void main(String[] args) 
	{
		Maths m1= new Maths();
		m1.add();
		m1.divide();
		m1.multiply();
		substract();
	}
}
