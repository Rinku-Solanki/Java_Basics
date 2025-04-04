package Programs;

import java.util.Arrays;
import java.util.Scanner;

public class P77_scanner_arrayinput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner s1=new Scanner(System.in);
System.out.println("enter the size of an array");
int[] rollno= new int[s1.nextInt()];
for(int i=0; i<=rollno.length-1; i++)
{
	System.out.println("enter the value of index positon;"+i);
	rollno[i]=s1.nextInt();
	
}
Arrays.toString(rollno);
System.out.println(Arrays.toString(rollno));
s1.close();
	}

}
