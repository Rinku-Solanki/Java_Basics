package Programs;

public class P70_Stringfun {
	public static void main(String[]args)
	{
		String A1="Rinks";
		String A2="Rinks";
		String A3="Rinku";
		boolean B1=	A1.equals(A2);
		boolean B2=	A1.equals(A3);
		boolean B3= A1.equalsIgnoreCase(A3);
		System.out.println(B1);
		System.out.println(B2);
		System.out.println(B3);
	}

}
