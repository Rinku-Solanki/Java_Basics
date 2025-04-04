package Programs;

public class Static_parametrised {



	 static void add(int a,int b)
	{
		System.out.println(a-b);
	}
	 static void sub(int a,int b)
	{
		System.out.println(a*b);
	}
	 static void mul()
	{
		int a=10;
		int b=20;
		System.out.println(a*b);
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Nonstatic_nonstatic p1=new Nonstatic_nonstatic();
		p1.add(5,2);
		p1.sub(8,5);
		p1.mul();
	}

}