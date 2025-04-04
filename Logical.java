package Programs;

public class Logical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10;
		int b=20;
		if(a==b && a>b)
		{
			System.out.println("1");
		}
		if(a!=b || a>b)
		{
			System.out.println("2");
		}
		if(!(a!=b || a<b))
		{
			System.out.println("3");
		}
		if(!(a==b && a>b))
		{
			System.out.println("4");
		}
	}

}
