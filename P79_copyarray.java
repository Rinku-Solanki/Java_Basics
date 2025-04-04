package Programs;
import java.util.Arrays;
import java.util.Scanner;

public class P79_copyarray {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        // Define and initialize the original boolean array
        boolean[] answer = new boolean[4];
        System.out.println("Enter 4 boolean values :");

        for (int i = 0; i < answer.length; i++) {
            answer[i] = s1.nextBoolean();
        }

        System.out.println("Original array: " + Arrays.toString(answer));

        // Close scanner after input
        s1.close();

        // Copying array manually
        boolean[] answer1 = new boolean[answer.length];
        for (int j = 0; j < answer.length; j++) {
            answer1[j] = answer[j];
        }

        System.out.println("Copied array: " + Arrays.toString(answer1));
    }
}