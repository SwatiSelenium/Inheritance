package Inheritance;

public class Child3 extends Parent
{
	void netbanking()
	{
		System.out.println("netbanking");
	}
	public static void main(String[] args) 
	{
		Child3 c1 = new Child3();
		c1.netbanking();
		c1.login();
	
	}

}
