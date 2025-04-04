package Programs;

public class Update_globalvariable 
{
 static double PI=3.14;
 int Noofdays2025=365;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
PI=3.15;
Update_globalvariable g1=new Update_globalvariable ();
g1.Noofdays2025=366;
System.out.println(PI);
System.out.println(g1.Noofdays2025);
	}

}
