package Inheritance;

public class ThisKeyword 
{
	String name;
	int age;
	double weight;
	
	void studentinfo(String name, int age, double weight)
	{
	//	System.out.println("My name is : "+ name);
		this.name=name;  /// this keyword
		this.age=age;
		this.weight=weight;
	}
	public static void main(String[] args) 
	{
		ThisKeyword t1 = new ThisKeyword();
		t1.studentinfo("SWATI", 10, 20.12);
		System.out.println(t1.age);
		System.out.println(t1.weight);
		System.out.println(t1.name);
	}

}
