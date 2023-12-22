package Inheritance;

interface Apple
{
	void ios();
	void siri();
}
interface Moto
{
	void android();
	void alexa();
}
class Nokia implements Apple,Moto
{
	public void android() 
	{
		System.out.println("1");
	}
	public void alexa() 
	{
		System.out.println("2");
	}

	public void ios() 
	{
		System.out.println("3");
	}

	public void siri() 
	{
		System.out.println("4");
	}
	
}
class Samsung extends Nokia
{
	static void galaxy()
	{
		System.out.println("5");
	}
	void zflip()
	{
		System.out.println("6");
	}
}
public class Phones extends Samsung
{
	static void mi()
	{
		System.out.println("7");
	}
	public static void main(String[] args) 
	{
		galaxy();
		mi();
		Phones p1= new Phones();
		p1.android();
		p1.alexa();
		p1.ios();
		p1.siri();
		p1.zflip();
	}

}
