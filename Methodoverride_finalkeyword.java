package Programs;
class condition
{
	final void login()
	{
		System.out.println("Login with emailid");
	}
}
public class Methodoverride_finalkeyword extends condition
{
void loginwithmobileno()
{
	
	System.out.println("Login with mobile no");
	super.login();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methodoverride_finalkeyword m1=new Methodoverride_finalkeyword();
		m1.login();
	}

}
