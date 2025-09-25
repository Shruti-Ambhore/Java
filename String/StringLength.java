public class StringLength {
    public static void main(String[] args) {
        String str = "Hello World";
        int count = 0;

        // Loop through each character manually
        for (char ch : str.toCharArray()) {
            count++; // increase count for each character
        }

        System.out.println("Length of the string: " + count);
    }
}
/*
 * int count = 0;
We create an integer variable count and set it to 0.
This will keep track of the number of characters in the string.
for (char ch : str.toCharArray()) {
str.toCharArray() converts the string into a character array.
"Hello" → ['H', 'e', 'l', 'l', 'o']
for (char ch : ...) is called a for-each loop.
It goes through each character of the array one by one.
ch is the current character in the loop.
count++;
For every character ch, we increase the counter by 1.
This counts each character in the string.
}
Ends the loop.
At this point, count contains the total number of characters in the string.
System.out.println("Length of the string: " + count);
Prints the length of the string to the console.
Example output for "Hello World" → Length of the string: 11.

 */