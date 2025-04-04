package Programs;

import java.util.Scanner;

public class Circumtences {

	public static void main(String[]args)
	{
		// TODO Auto-generated method stub
		System.out.println("Please enter the value of r=");
		System.out.println("Please enter the value of a=");
		System.out.println("Please enter the value of b=");
		System.out.println("Please enter the value of c=");
		Scanner s1=new Scanner(System.in);
		int r=s1.nextInt();
		int a=s1.nextInt();
		int b=s1.nextInt();
		int c=s1.nextInt();
double cir1=2*Math.PI*r;//circumstance of circle
double cir2=a+b+c;//circumstance of triangle
double cir3=4*a;//circumstance of square
double cir4=2*(a+b);//circumstance of rectangle
		System.out.println("circumstance of circle="+cir1);
		System.out.println("circumstance of circle="+cir2);
		System.out.println("circumstance of circle="+cir3);
		System.out.println("circumstance of circle="+cir4);
s1.close();

}

}
