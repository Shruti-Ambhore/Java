/*
 * Input: "swiss"
Loop iterations:
i=0 → 's' → count = 3 → repeated → skip
i=1 → 'w' → count = 1 → first non-repeating → print 'w' → break
 */

public class FirstNonRe2 {
    public static void main(String[] args) {
        String str = "swiss";
        str = str.toLowerCase(); // optional: for case-insensitive

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;

            // Count how many times ch appears in the string
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == ch) {
                    count++;
                }
            }

            // If count is 1, it's the first non-repeating character
            if (count == 1) {
                System.out.println("First non-repeating character: " + ch);
                break;
            }
        }
    }
}
