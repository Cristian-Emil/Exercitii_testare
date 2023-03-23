package Java_E5;
import java.util.Scanner;

    public class PIG_Latin_V1 {
        private static Scanner scan = new Scanner(System.in);

        public static void main(String[] args) {
            System.out.print("Enter one or more words that you would like to translate to Pig Latin: ");
            final String userInput = scan.nextLine();
            scan.close();

            String[] word = userInput.split(" "); // Splits the string into an array of words
            String output = "";

            for (int i = 0; i < word.length; i++) {
                String pigLatinWord = translateWord(word[i]); // Translates each word individually
                output += pigLatinWord + " "; // Joins the translated word back into the output
            }

            System.out.println("Original Word(s): " + userInput);
            System.out.println("Translation: " + output + "\n");
        }

        public static String translateWord(String word) {
            String lowerCaseWord = word.toLowerCase();
            int pos = -1; // Position of first vowel
            char ch;

            // This for loop finds the index of the first vowel in the word
            for (int i = 0; i < lowerCaseWord.length(); i++) {
                ch = lowerCaseWord.charAt(i);

                if (isVowel(ch)) {
                    pos = i;
                    break;
                }
            }

            if (pos == 0) {
                // Translating word if the first character is a vowel (Rule 3)
                return lowerCaseWord + "yay"; // Adding "yay" to the end of string (can also be "way" or just "ay")
            } else {
                // Translating word if the first character(s) are consonants (Rule 1 and 2)
                String a = lowerCaseWord.substring(pos); // Extracting all characters in the word beginning from the 1st vowel
                String b = lowerCaseWord.substring(0, pos); // Extracting all characters located before the first vowel
                return a + b + "ay"; // Adding "ay" at the end of the extracted words after joining them.
            }
        }

        // This method checks if the character passed is a vowel (the letter "y" is counted as a vowel in this context)
        public static Boolean isVowel(char ch) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'y') {
                return true;
            }
            return false;
        }
}

