package Programs;

import java.util.Scanner;

public class Rectangle_circumtance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		
		System.out.println("Please enter the value of a=");
		System.out.println("Please enter the value of b=");
		
		Scanner s1=new Scanner(System.in);
		
		int a=s1.nextInt();
		int b=s1.nextInt();
		
		double cir4=2*(a+b);//circumstance of rectangle
		System.out.println("circumstance of circle="+cir4);
s1.close();
	}

}
