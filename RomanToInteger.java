package pack;
import java.util.HashMap;
import java.util.Scanner;
public class RomanToInteger {
 public static void main(String[] args)
 
{
        Scanner scanner = new Scanner(System.in);

        // Get the Roman number input from the user
        System.out.println("Enter a Roman number: ");
        String romanNumber = scanner.nextLine();

        // Create a HashMap to store the Roman numerals and their corresponding integer values
        HashMap<Character, Integer> romanNumerals = new HashMap<>();
        romanNumerals.put('I', 1);
        romanNumerals.put('V', 5);
        romanNumerals.put('X', 10);
        romanNumerals.put('L', 50);
        romanNumerals.put('C', 100);
        romanNumerals.put('D', 500);
        romanNumerals.put('M', 1000);

        // Convert the Roman number to an integer
        int integerValue = convertRomanToInt(romanNumber, romanNumerals);

        // Print the integer value
        System.out.println("The integer value of the Roman number " + romanNumber + " is " + integerValue);
    }

    private static int convertRomanToInt(String romanNumber, HashMap<Character, Integer> romanNumerals) {
        int integerValue = 0;

        // Iterate over the Roman number string
        for (int i = 0; i < romanNumber.length(); i++) {
            // Get the current Roman numeral
            char currentRomanNumeral = romanNumber.charAt(i);

            // Get the integer value of the current Roman numeral
            int currentIntegerValue = romanNumerals.get(currentRomanNumeral);

            // If the next Roman numeral is greater than the current Roman numeral, then subtract the current Roman numeral from the integer value
            if (i + 1 < romanNumber.length() && romanNumerals.get(romanNumber.charAt(i + 1)) > currentIntegerValue) {
                integerValue -= currentIntegerValue;
            } else {
                // Otherwise, add the current Roman numeral to the integer value
                integerValue += currentIntegerValue;
            }
        }

        return integerValue;
    }
}
