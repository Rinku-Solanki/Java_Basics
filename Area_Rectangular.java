package Programs;

import java.util.Scanner;

public class Area_Rectangular {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Please enter the value of a=");
		System.out.println("Please enter the value of l=");
		Scanner s1=new Scanner(System.in);
int a=s1.nextInt();//a is width of square
int l=s1.nextInt();//l is length of rectangle
double area4=a*l;//area of rectangle
System.out.println(area4);
	s1.close();
	}

}
