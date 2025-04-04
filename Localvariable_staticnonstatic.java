package Programs;

public class Localvariable_staticnonstatic
{
	
	static void add()
	{
		int a=100;
		int b=200;
	
		System.out.println(a+b);
	}
	void sub()
	{
		int a=100;
		int b=20;
		System.out.println(a-b);
		
	}
	
	public static void main(String[]args)
	{
		Localvariable_staticnonstatic m=new Localvariable_staticnonstatic();
		m.sub();
		add();
		
	}

}

