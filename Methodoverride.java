package Programs;
class precondition
{
	void login()
	{
		System.out.println("Login using email id");
	}
}
public class Methodoverride extends precondition
{
	void login()
	{
	
		System.out.println("Login using mobile number");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methodoverride m1=new Methodoverride();
		m1.login();
		
	}

}
