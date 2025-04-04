package Programs;

import java.util.Scanner;

public class P76_arrayaverage {

	public static void main(String[] args) {
		int sum = 0;
        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int[] array = new int[s1.nextInt()];

       
        for (int i = 0; i < array.length; i++) 
        {
            System.out.println("Enter the value of array index " + i + ":");
            array[i] = s1.nextInt();
            sum += array[i];
        }

        double average =  sum / array.length;

        System.out.println("Average: " + average);
    }
}
