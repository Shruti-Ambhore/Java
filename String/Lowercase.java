//Loop through each character of the string.
//If the character is lowercase ('a' to 'z'), subtract 32 from its ASCII → gets uppercase.
//If the character is uppercase ('A' to 'Z'), add 32 → gets lowercase.

//Simplest Lowercase to Uppercase
public class Lowercase {
    public static void main(String[] args) {
        String str = "Hello World";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // if lowercase, convert to uppercase
            if (ch >= 'a' && ch <= 'z') {
                ch = (char)(ch - 32); // simple ASCII conversion
            }

            result += ch; // add character to result
        }

        System.out.println(result);
    }
}

