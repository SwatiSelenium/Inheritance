package Inheritance;

abstract class Google
{
	abstract void auth();
	abstract void authentication();
	void loginwithgoogle()
	{
		System.out.println("1");
	}
}
public class Zoom extends Google 
{
	void login()
	{
		System.out.println(" login in Zoom");
	}
	void logout()
	{
		System.out.println(" logout from Zoom");
	}
	public static void main(String[] args) 
	{
		Zoom z1 = new Zoom();
		z1.auth();
		z1.authentication();
		z1.login();
		z1.logout();
		z1.loginwithgoogle();
	}
	void auth() 
	{
		System.out.println("getting the auth from Google");
	}
	void authentication() 
	{
		System.out.println("getting the authentication from Google");
	}

}
