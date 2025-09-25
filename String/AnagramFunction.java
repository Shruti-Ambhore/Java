//Two strings are anagrams if they contain exactly the same characters in any order.
//Example: "listen" and "silent" → anagrams.

public class AnagramFunction {
    // Function to check if two strings are anagrams
    public static boolean isAnagram(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if (str1.length() != str2.length()) return false;

        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            boolean found = false;

            for (int j = 0; j < str2.length(); j++) {
                if (ch == str2.charAt(j)) {
                    // Remove character from str2
                    str2 = str2.substring(0, j) + str2.substring(j + 1);
                    found = true;
                    break;
                }
            }

            if (!found) return false; // char not found → not anagram
        }

        return true; // all characters matched
    }

    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        if (isAnagram(str1, str2)) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not anagrams");
        }
    }
}
