package Inheritance;
public class StringFunctions 
{

	public static void main(String[] args) 
	{
		String a = "India";
		String b = "is my country";
		String c= "Manish Kumar Tiwari";
		String d= "MANISH";
		String e= "Abhishek";

		System.out.println(a.concat(" ").concat(b));

		System.out.println();
		System.out.println(c.substring(0, 6));
		System.out.println(c.substring(7, 12));
		System.out.println(c.substring(13));
		
		System.out.println();
		System.out.print(c.charAt(0));
		System.out.print(c.charAt(7));
		System.out.println(c.charAt(13));
		
		System.out.println();
		System.out.println(c.charAt(0));
		System.out.println(c.charAt(7));
		System.out.println(c.charAt(13));
		
		System.out.println();
		System.out.print(d.charAt(0));
		System.out.print(e.charAt(0));
		System.out.print(d.charAt(1));
		System.out.print(e.charAt(1));
		System.out.print(d.charAt(2));
		System.out.print(e.charAt(2));
		System.out.print(d.charAt(3));
		System.out.print(e.charAt(3));
		System.out.print(d.charAt(4));
		System.out.print(e.charAt(4));
		System.out.print(d.charAt(5));
		System.out.print(e.charAt(5));
		System.out.print(e.charAt(6));
		System.out.println(e.charAt(7));
		
		System.out.println();		
		
		System.out.print(d.toUpperCase().charAt(0));
		System.out.print(d.toLowerCase().charAt(1));
		System.out.print(d.toUpperCase().charAt(2));
		System.out.print(d.toLowerCase().charAt(3));
		System.out.print(d.toUpperCase().charAt(4));
		System.out.print(d.toLowerCase().charAt(5));
	
	}

}
