package Inheritance;

abstract class Teacher //Abstract class
{
	abstract void add(); // Abstract method
}

public class Student extends Teacher	//concrete class
{
	public static void main(String[] args) 
	{
		Student s1= new Student();
		s1.add();
	}

	void add() //concrete method
	{
		int a=10;
		int b=40;
		int c=a+b;
		System.out.println(c);
		
	}

}
