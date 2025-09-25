//Simplest Uppercase to Lowercase

public class Upercase {
    public static void main(String[] args) {
        String str = "HELLO WORLD";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // if uppercase, convert to lowercase
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char)(ch + 32); // simple ASCII conversion
            }

            result += ch;
        }

        System.out.println(result);
    }
}

    

