package Programs;

public class Staticinside_main_method 
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
		Staticinside_main_method m=new Staticinside_main_method();
		m.sub();
		add();
		
	}

}
