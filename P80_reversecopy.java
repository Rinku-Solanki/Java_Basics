package Programs;

import java.util.Arrays;
import java.util.Scanner;

public class P80_reversecopy {
	public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the size of an array :");
        
        int input []=new int[3];
        input[0]=33;
        input[1]=44;
        input[2]=55;
        int []output=new int[input.length];
        s1.close();
        for (int i=0,j = 2;  i <= input.length-1; i++,j--) 
        {
            output[j] = input[i];
        }
        System.out.println("Original  array: " + Arrays.toString(input));
        System.out.println("Copied array: " + Arrays.toString(output));
	}
}


