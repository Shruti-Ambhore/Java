public class VowelConsonantFunction{
    // Function to count vowels and consonants
    public static void countVowelsConsonants(String str) {
        int vowels = 0;
        int consonants = 0;

        str = str.toLowerCase(); // convert to lowercase

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') { // consider only letters
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }

    public static void main(String[] args) {
        String str = "Hello World";
        countVowelsConsonants(str); // call function
    }
}
