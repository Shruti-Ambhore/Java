public class FirstNonRepeating {
    public static void main(String[] args) {
        String str = "swiss";
        str = str.toLowerCase(); // optional: for case-insensitive

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // If the first index and last index are same, character occurs only once
            if (str.indexOf(ch) == str.lastIndexOf(ch)) {
                System.out.println("First non-repeating character: " + ch);
                break;
            }
        }
    }
}
//str.indexOf(ch) → returns the first position of the character ch in the string.
//str.lastIndexOf(ch) → returns the last position of the character ch.
//If first position = last position, it means the character occurs only once.
//Example: For 'w' in "swiss", first index = last index = 1 → occurs only once.

//Input string: "swiss"
//Loop iterations:
//i=0 → 's' → indexOf = 0, lastIndexOf = 4 → repeated → skip
//i=1 → 'w' → indexOf = 1, lastIndexOf = 1 → non-repeating → print 'w' → break