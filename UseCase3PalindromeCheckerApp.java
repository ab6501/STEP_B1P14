
/**
 * =========================================================================
 * MAIN CLASS - UseCase3PalindromeCheckerApp
 * =========================================================================
 *
 * Use Case 3: Palindrome Check Using String Reverse
 *
 * Description:
 * This class checks whether a string is a palindrome
 * by reversing the string and comparing it with the
 * original value.
 *
 * At this stage, the application:
 * - Reverses the string using a loop
 * - Compares original and reversed strings
 * - Displays the validation result
 *
 * This implementation demonstrates string reversal
 * and comparison using basic Java concepts.
 *
 * @author Developer
 * @version 3.0
 */

public class UseCase3PalindromeCheckerApp {

    /**
     * Application entry point for UC3.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        String input = "madam";
        String reversed = "";

        // Reverse the string using a loop
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }

        // Compare original and reversed strings
        if (input.equals(reversed)) {
            System.out.println("Input : " + input);
            System.out.println("Reversed : " + reversed);
            System.out.println("Is Palindrome? : true");
        } else {
            System.out.println("Input : " + input);
            System.out.println("Reversed : " + reversed);
            System.out.println("Is Palindrome? : false");
        }

    }
}
