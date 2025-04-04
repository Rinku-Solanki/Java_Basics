package Programs;

public class P72_palindromde {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				String input="radar";
				String output="";
				for (int i=input.length()-1;i>=0; i--)
				{
					char a=input.charAt(i);
					
					output=output+a;
					
				}
				System.out.println("The output of given input is: "+ output);
				if(input.equals(output))
				{
					System.out.println("String is palindrome");
				}
				else
				{
					System.out.println("String is not palindrome");
			}

		}
		

	}


