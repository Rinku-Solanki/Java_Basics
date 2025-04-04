package Programs;

public class Nonstatic_parametrised
{
	
		 void add(int a,int b)
		{
			System.out.println(a+b);
		}
		 void sub(int a,int b)
		{
			System.out.println(a-b);
		}
		 void mul(int a,int b)
		{
			 System.out.println(a*b);
		}
		 void div(int a,int b)
			{
				 System.out.println(a/b);
			}
		
		public static void main(String[] args) 
		{
			// TODO Auto-generated method stub

			Nonstatic_parametrised p1=new Nonstatic_parametrised();
			p1.add(5,2);
			p1.sub(8,5);
			p1.mul(10,20);
			p1.div(100,20);
		}

	}