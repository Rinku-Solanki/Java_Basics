package Programs;
class precondtion
{
	void login()
	{
		System.out.println("Login with email id");
	}
}
public class Methodoverriding_super extends precondition
{
void login()
{
	super.login();
	System.out.println("Login with mobile number");
}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Methodoverriding_super m1=new Methodoverriding_super();
		m1.login();
	}

}
