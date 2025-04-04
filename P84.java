package Programs;

import java.util.Arrays;

public class P84 {
    static int countOfAlpha = 0;
    static int countOfDigits = 0;
    static int countOfSpaces = 0;

    public static void main(String[] args) {
        String input = " k v no 2 ";

        char[] array = input.toCharArray();

        System.out.println("Input array is: " + Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {  // Changed `i<=array.length-1` to `i < array.length`
            if (Character.isAlphabetic(array[i])) {
                countOfAlpha++;
            }

            if (Character.isDigit(array[i])) {
                countOfDigits++;
            }

            if (Character.isWhitespace(array[i])) {
                countOfSpaces++;
            }
        }

        int countOfSpecialCharacters = input.length() - (countOfAlpha + countOfDigits + countOfSpaces);

        // Printing final counts after the loop
        System.out.println("Count of Alphabets: " + countOfAlpha);
        System.out.println("Count of Digits: " + countOfDigits);
        System.out.println("Count of Spaces: " + countOfSpaces);
        System.out.println("Count of Special Characters: " + countOfSpecialCharacters);
    }
}