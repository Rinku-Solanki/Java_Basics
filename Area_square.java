package Programs;

import java.util.Scanner;

public class Area_square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Please enter the value of a=");
		
		Scanner s1=new Scanner(System.in);

int a=s1.nextInt();//a is width of square

double area3=a*a;//area of square

System.out.println(area3);

	s1.close();
	}

}
