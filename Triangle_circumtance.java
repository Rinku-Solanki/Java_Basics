package Programs;
import java.util.Scanner;


public class Triangle_circumtance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter the value of a=");
		System.out.println("Please enter the value of b=");
		System.out.println("Please enter the value of c=");
		Scanner s1=new Scanner(System.in);
	
		int a=s1.nextInt();
		int b=s1.nextInt();
		int c=s1.nextInt();
		double cir2=a+b+c;
		System.out.println("circumstance of circle="+cir2);
		s1.close();
	}

}
