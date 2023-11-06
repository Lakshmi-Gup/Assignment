package pack;
import java.util.Scanner;
public class PangramChecker {


    public static boolean isPangram(String input) {
        // Create a boolean array to mark the characters present in the input
        boolean[] markedCharacters = new boolean[26];

        // Iterate over the input string and mark the characters present
        for (char character : input.toCharArray()) {
            int index = character - 'a';
            if (index >= 0 && index < 26) {
                markedCharacters[index] = true;
            }
        }

        // Check if all the characters are marked
        for (boolean markedCharacter : markedCharacters) {
            if (!markedCharacter) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input string from the user
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();

        // Check if the input string is a pangram
        boolean isPangram = isPangram(input);

        // Print the result
        if (isPangram) {
            System.out.println("The input string is a pangram.");
        } else {
            System.out.println("The input string is not a pangram.");
        }
    }
}
