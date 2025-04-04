package Programs;

public class Globalvar_static_nonstatic {
static int a=5;
static int b=4;
int Noofdays2025=365;
static void add()
{
	System.out.println(a+b);
}
void Noofdays2025()
{

System.out.println(Noofdays2025);
}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
add();
Globalvar_static_nonstatic g1=new Globalvar_static_nonstatic();
g1.Noofdays2025();


	}
	
}


