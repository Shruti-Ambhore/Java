public class PalindromeSimple {
    public static void main(String[] args) {
        String str = "madam";

        // reverse the string using StringBuilder
        String reversed = new StringBuilder(str).reverse().toString();

        if (str.equals(reversed)) {
            System.out.println(str + " is a palindrome");
        } else {
            System.out.println(str + " is not a palindrome");
        }
    }
}
/*
 * new StringBuilder(str) → Creates a mutable string object.
.reverse() → Reverses the string.
.toString() → Converts it back to a regular string.
str.equals(reversed) → Checks if original string is same as reversed string.
Print result.

Time Complexity: O(n) → reverses the string once.
Space Complexity: O(n) → extra space for reversed string.
 */