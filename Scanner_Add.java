package Programs;

import java.util.Scanner;

public class Scanner_Add {
	public static void main(String[]args) 
	{
		System.out.println("Enter the value of a=");
		System.out.println("Enter the value of b=");
		
		Scanner s1=new Scanner(System.in);
		int a=s1.nextInt();
		int b=s1.nextInt();
		int sum=a+b;
		
		System.out.println(sum);
		s1.close();
		
	

}
}