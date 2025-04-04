package Programs;

public class P75 {
    public static void main(String[] args) {
        // Check if arguments are provided
        if (args.length == 0) {
            System.out.println("No arguments provided. Please pass values at runtime.");
            return;
        }

        // Join all command-line arguments into a single string
        String input = String.join(" ", args);

        int countOfAlpha = 0;
        int countOfDigits = 0;
        int countOfSpaces = 0;
        int countOfSpecialCharacters = 0;

        // Processing each character in the input string
        for (char ch : input.toCharArray()) {
            if (Character.isAlphabetic(ch)) {
                countOfAlpha++;
            } else if (Character.isDigit(ch)) {
                countOfDigits++;
            } else if (Character.isWhitespace(ch)) {
                countOfSpaces++;
            } else {
                countOfSpecialCharacters++;
            }
        }

        // Printing results
        System.out.println("Input: " + input);
        System.out.println("Count of Alphabets: " + countOfAlpha);
        System.out.println("Count of Digits: " + countOfDigits);
        System.out.println("Count of Spaces: " + countOfSpaces);
        System.out.println("Count of Special Characters: " + countOfSpecialCharacters);
    }
}