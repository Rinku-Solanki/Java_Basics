package Programs;

public class Static_nonstatic1
{
	static void add()
	{
		int a=100;
		int b=200;
		int c=a+b;
		System.out.println(c);
	}
	void sub()
	{
		int a=100;
		int b=20;
		System.out.println(a-b);
		
	}
	
	public static void main(String[]args)
	{
		Static_nonstatic1 m=new Static_nonstatic1();
		m.sub();
		add();
		
	}

}



