package Inheritance;

class Supercity
{
	Supercity(String a)
	{
		System.out.println("I am City");
	}
}
public class SuperState extends Supercity
{
	SuperState()
	{
	//	super(); // this is present implicitly in case of non para constructor
		super("Swati");
		System.out.println(" I am State");
	}
	public static void main(String[] args) 
	{
		new SuperState();	
	}
}
