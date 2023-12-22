package Inheritance;

class parent
{
	void add()
	{
		System.out.println("adding 3 numbers");
	}
}
public class Childest extends parent 
{
	void add()
	{
//	super.add();
		System.out.println("adding 2 numbers");
		super.add();
	}

	public static void main(String[] args) 
	{
		Childest c1 = new Childest();
		c1.add();
	}

}
