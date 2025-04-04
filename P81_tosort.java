package Programs;

import java.util.Arrays;

public class P81_tosort {

	public static void main(String[] args) {
        System.out.println("Enter the size of an array :");
        int input []=new int[3];
        input[0]=323;
        input[1]=104;
        input[2]=575;
      
        System.out.println("Sorting array: " + Arrays.toString(input));
        
         Arrays.sort(input);
         int[] output = Arrays.copyOf(input, input.length);
              
        System.out.println("Sorting array: " + Arrays.toString(output));
	}
}


