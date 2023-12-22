package Inheritance;

class three extends two
{
	static void three3()
	{
		System.out.println(" Three");
	}
}
class two
{
	static void two2()
	{
		System.out.println(" Two");
	}
}
class one extends two
{
	static void one1()
	{
		System.out.println("One");
	}
}	
public class Hybrid_Class extends one 
{
	static void childest()
	{
		System.out.println(" Three");
	}
	
	public static void main(String[] args) 
	{
		childest();
		one1();
		two2();
		three t1 = new three();
		t1.three3();
	}
}
