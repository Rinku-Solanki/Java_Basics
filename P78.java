package Programs;

import java.util.Arrays;
import java.util.Scanner;

public class P78 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s1=new Scanner(System.in);
System.out.println("Please enter the size of an array:");
int [] array1= new int[s1.nextInt()];
int [] array2= new int[array1.length];
for(int i=0; i<=array1.length-1 ;i++)
{
	System.out.println("enter the value of arra1 of index: "+i);
	array1[i]=s1.nextInt();
	System.out.println("enter the value of arra2 of index: "+i);
	array2[i]=s1.nextInt();
	
}
	System.out.println(Arrays.toString(array1));
	System.out.println(Arrays.toString(array2));


	System.out.println("first array is: "+Arrays.toString(array1));
	System.out.println("second array is: "+Arrays.toString(array2));
	
	boolean b1=	Arrays.equals(array1, array2);
	if(b1==true)
	{
		System.out.println("both arrays are equal");
		
	}
	
	else
	{
		System.out.println("both arrays are not equal");
		
	}
}
}


