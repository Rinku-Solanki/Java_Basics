package Programs;

public class Constructor_ov 
{
	Constructor_ov ()
	{
		System.out.println("1");
	}
	Constructor_ov (int a)
	{
		System.out.println("2");
	}
	
		Constructor_ov (int a,int b)
		{
			System.out.println("3");
		}
		Constructor_ov (int a,double b)
		{
			System.out.println("4");
		}
		Constructor_ov (double b,int a)
		{
			System.out.println("5");
		}
		public static void main(String[]args)
		{
		new Constructor_ov();
		new Constructor_ov(100);
		new Constructor_ov(100,200);
		new Constructor_ov(100,200.1);
		new Constructor_ov(100.1,200);
		//Constructor_ov m=new Constructor_ov();
		//new Constructor_ov();
}
}