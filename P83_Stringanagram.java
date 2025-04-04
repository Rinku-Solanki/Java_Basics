package Programs;

import java.util.Arrays;

public class P83_Stringanagram
{

	public static void main(String[] args)
	{
		String a="ear";
		String b="are";
if(a.length()!=b.length())
	{
		System.out.println("Strings are not Anagram");
	}
else
	{
		System.out.println("Ok the length of the two strings are same:");
	}
		char c1[]=a.toCharArray();
		char c2[]=b.toCharArray();
		
		System.out.println("Before sorting c1: "+Arrays.toString(c1));
		System.out.println("Before sorting c1: "+Arrays.toString(c2));
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		System.out.println("After sorting c1: "+Arrays.toString(c1));
		System.out.println("After sorting c1: "+Arrays.toString(c2));
		
		boolean b1 =Arrays.equals(c1, c2);
if (b1== true)
	{
		System.out.println("Strings are Anagram");

	}
else
	{
	    System.out.println("Strings are not Anagram");
	}
		
	}

}
