package Inheritance;

public class Child1 extends Parent
{
	void debitcard()
	{
		System.out.println("Debitcard");
	}
	public static void main(String[] args) 
	{
		Child1 c1 = new Child1();
		c1.debitcard();
		c1.login();

	}

}
