package Programs;

import java.util.Scanner;

public class Area {

	
			public static void main(String[]args)
			{
				// TODO Auto-generated method stub
				System.out.println("Please enter the value of r=");
				System.out.println("Please enter the value of b=");
				System.out.println("Please enter the value of h=");
				System.out.println("Please enter the value of a=");
				System.out.println("Please enter the value of l=");
				Scanner s1=new Scanner(System.in);
		int r=s1.nextInt();//radius of circle
		int b=s1.nextInt();//breath of square
		int h=s1.nextInt();//height of square
		int a=s1.nextInt();//a is width of square
		int l=s1.nextInt();//l is length of rectangle
		double area1=Math.PI*r*r;//area of circle
		double area2=0.5 *b*h;//area of triangle
		double area3=a*a;//area of square
		double area4=a*l;//area of rectangle
		System.out.println(area1);//Area of circle=PI*r*r
		System.out.println(area2);
		System.out.println(area3);
		System.out.println(area4);
			s1.close();

		}
	}


