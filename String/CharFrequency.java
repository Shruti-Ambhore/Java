public class CharFrequency {
    public static void main(String[] args) {
        String str = "hello";
        str = str.toLowerCase(); // optional for case-insensitive counting

        // Loop through each character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;

            // Count how many times this character appears
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == ch) {
                    count++;
                }
            }

            // Print frequency only the first time we encounter the character
            boolean alreadyPrinted = false;
            for (int k = 0; k < i; k++) {
                if (str.charAt(k) == ch) {
                    alreadyPrinted = true;
                    break;
                }
            }

            if (!alreadyPrinted) {
                System.out.println(ch + " occurs " + count + " times");
            }
        }
    }
}
/*
 * Take each character ch from the string.
Count how many times ch appears in the string using the inner loop.
Before printing, check if this character was already printed before.
If not printed yet, print the character and its frequency.
Repeat for all characters.
 */

