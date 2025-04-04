package Programs;

public class P71_Stringfun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="Rinks";
		String output="";
		for (int i=input.length()-1;i>=0; i--)
		{
			char a=input.charAt(i);
			
			output=output+a;
			
		}
		System.out.println(output);
	}

}
