package Inheritance;

class Kia
{
	void sedan()
	{
		System.out.println("Sedan:Great grant parent-concrete non static method");
	}
}
abstract class Maruti extends Kia
{
	static void smallcar()
	{
		System.out.println(" SmallCar:Grant-parent-concrete AND static method");
	}
	abstract void ev();
	abstract void nano();
}
abstract class Tata extends Maruti
{
	static void minicar()
	{
		System.out.println("Minicar :Parent-concrete static method");
	}
	void suv()
	{
		System.out.println("SUV: Parent-concrete Non-static method");
	}
	abstract void luxury();
	abstract void nexon();
	
}
public class Cars extends Tata
{
	static void sonet()
	{
		System.out.println("Sonet:Child -concrete AND static method");
	}
	void toyota()
	{
		System.out.println("Toyota: Child - concrete non static method");
	}
	
	public static void main(String[] args) 
	{
		smallcar();
		minicar();
		sonet();
		Cars c1= new Cars();
		c1.sedan();
		c1.suv();
		c1.toyota();
		c1.ev();
		c1.nano();
		c1.luxury();
		c1.nexon();
	}
	
	void luxury() 
	{
		System.out.println("abstract method name : Luxury");	
	}

	void nexon() 
	{
		System.out.println("abstract method name : Nexon");	
	}

	void ev() 
	{
		System.out.println("abstract method name : EV");	
	}

	void nano() 
	{
		System.out.println("abstract method name : Nano");
	}
}
