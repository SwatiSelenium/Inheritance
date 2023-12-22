package Inheritance;

abstract class Rose
{
	abstract void lotus();
	abstract void sunflower();
	static void shoeflower()
	{
		System.out.println("GGP - Concrete M1");
	}
	void marigold()
	{
		System.out.println("GGP - Concrete M2");
	}
}
abstract class Lily extends Rose
{
	abstract void jasmine();
	abstract void tulip();
	static void orchid()
	{
		System.out.println("GP - Concrete M3");
	}
	void iris()
	{
		System.out.println("GP - Concrete M4");
	}
}
public class Flowers extends Lily
{
	static void jai()
	{
		System.out.println("Child - Concrete M5");
	}
	void jui()
	{
		System.out.println("Child - Concrete M6");
	}
	public static void main(String[] args) 
	{
		shoeflower();
		orchid();
		jai();
		Flowers f1 =new Flowers();
		f1.marigold();
		f1.jui();
		f1.iris();
		f1.jasmine();
		f1.tulip();
		f1.lotus();
		f1.sunflower();
	}
	void tulip() 
	{
		System.out.println("Abstract 1");
		
	}
	void lotus() 
	{
		System.out.println("Abstract 2");
		
	}
	void sunflower() 
	{
		System.out.println("Abstract 3");
		
	}
	void jasmine() 
	{
		System.out.println("Abstract 4");
		
	}

}
