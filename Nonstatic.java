package Programs;

public class Nonstatic {
void add()
{
	int a=10;
	int b=20;
	System.out.println(a+b);
	
}
void sub()
{
	int a=100;
	int b=20;
	System.out.println(a-b);
	
}
void mul()
{
	int a=10;
	int b=20;
	System.out.println(a*b);
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Nonstatic m=new Nonstatic();
m.add();
m.sub();
m.mul();

	}


}
