public class ReverseString {
    public static void main(String[] args) {
        String str = "Hello";
        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i); // add characters from end to start
        }

        System.out.println("Reversed string: " + reversed);
    }
}


/*
 * reversed += str.charAt(i);
str.charAt(i)
This gets the character at position i in the string str.
Example: if str = "Hello"
str.charAt(0) → 'H'
str.charAt(1) → 'e'
str.charAt(4) → 'o'

reversed +=
This is shorthand for reversed = reversed + ....
It adds the new character to the end of the current reversed string.

Step-by-step Example:
Original string: "Hello"
Start: reversed = ""

i = 4 → str.charAt(4) = 'o' → reversed = "" + 'o' = "o"
i = 3 → str.charAt(3) = 'l' → reversed = "o" + 'l' = "ol"
i = 2 → str.charAt(2) = 'l' → reversed = "ol" + 'l' = "oll"
i = 1 → str.charAt(1) = 'e' → reversed = "oll" + 'e' = "olle"
i = 0 → str.charAt(0) = 'H' → reversed = "olle" + 'H' = "olleH"

Final reversed = "olleH" ✅
 */