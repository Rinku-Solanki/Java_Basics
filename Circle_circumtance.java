package Programs;
import java.util.Scanner;
public class Circle_circumtance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter the value of r=");
		Scanner s1=new Scanner(System.in);
		int r=s1.nextInt();
		double cir1=2*Math.PI*r;
		System.out.println("circumstance of circle="+cir1);
		s1.close();
	}

}
