package Inheritance;

public class mockstring {

	public static void main(String[] args) 
	{
		String a = "India";
		String b = "is my country";
		String c= "Manish Kumar Tiwari";
		String d= "MANISH";
		String e= "Abhishek";
		
		System.out.println(a.concat(d).concat(b));
		
		System.out.println(c.charAt(3));
		System.out.println(e.indexOf('h'));
		
		System.out.println(a.substring(3));
		System.out.println(a.substring(1,4));
		System.out.println(a.toLowerCase().charAt(3));
		System.out.println(a.concat(" + ").concat(b));
	}

}
