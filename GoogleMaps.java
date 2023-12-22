package Inheritance;

interface GoogleAuth
{
	void un();
	void pwd();
}
interface Google2wayauth
{
	void sms();
	void call();
}
public class GoogleMaps implements Google2wayauth, GoogleAuth
{

	public static void main(String[] args) 
	{
		GoogleMaps g1 = new GoogleMaps();
		g1.call();
		g1.sms();
		g1.un();
		g1.pwd();

	}
	public void un() 
	{
		System.out.println("UName");
	}

	
	public void pwd() {
		System.out.println("PWD");
		
	}

	
	public void sms() {
		System.out.println("SMS");
		
	}

	
	public void call() {
		System.out.println("Call");
		
	}

}
