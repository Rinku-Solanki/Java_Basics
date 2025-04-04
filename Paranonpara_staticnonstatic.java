package Programs;

public class Paranonpara_staticnonstatic
{
static void Method1(char a,char b,String name)
{
	System.out.println("Method1: " + a + ", " + b + ", " + name);
}
void Method2(boolean a,String name,double d)
{
	System.out.println("Method2: " + a + ", " + name + ", " + d);
}
static void Method3()
{
	 System.out.println("Method3");
}
static void Method4()
{
	System.out.println("Method4:");
}
void Method5(int a,int b,int c,double d)
{
	System.out.println("Method5: " + a + ", " + b + ", " + c + ", " + d);
}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
Method1('M','f',"ABC");
Paranonpara_staticnonstatic P1=new Paranonpara_staticnonstatic();
P1.Method2(false, "ram",3.14);
Method3();
Method4();
P1.Method5(2, 4,6, 3.14);

	}

}
