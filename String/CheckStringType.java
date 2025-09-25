/*
 * Loop through each character of the string.

Check if character is letter → 'a'-'z' or 'A'-'Z'.
Check if character is digit → '0'-'9'.

Track flags:
onlyLetters = true if all characters are letters
onlyDigits = true if all characters are digits
Print result based on flags.
 */

public class CheckStringType {
    public static void main(String[] args) {
        String str = "Hello123"; // you can change this

        boolean onlyLetters = true;
        boolean onlyDigits = true;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
                onlyDigits = false; // has letters, so not only digits
            } else if (ch >= '0' && ch <= '9') {
                onlyLetters = false; // has digits, so not only letters
            } else {
                // other characters (symbols, spaces)
                onlyLetters = false;
                onlyDigits = false;
            }
        }

        if (onlyLetters) {
            System.out.println("String contains only letters");
        } else if (onlyDigits) {
            System.out.println("String contains only digits");
        } else {
            System.out.println("String contains both letters and digits or other characters");
        }
    }
}

    

    
