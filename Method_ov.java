package Programs;

public class Method_ov 
{
static void add()
{
System.out.println("1");
}
static void add(int a)
{
	System.out.println(a+7);
}
static void add(int a,int b)
{
	System.out.println(a+b+7);
}
static void add(double a,double b)
{
	System.out.println(a+b+7);
}
public static void main(String[]args)
{
	add();
	add(10);
	add(10,20);
	add(10.2,20.2);
	//Method_ov M1=new Method_ov();
	//M1.add(3.14,2.0);
}
}