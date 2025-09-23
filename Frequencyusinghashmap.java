import java.util.HashMap;
public class Frequencyusinghashmap {
    public static void main(String[] args) {
        int[] arr = {10, 20, 10, 30, 20, 10};

        HashMap<Integer, Integer> map = new HashMap<>();

        // Step 1: Count frequencies
        for (int num : arr) { //for each number in the array:
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Step 2: Print frequencies
        for (int key : map.keySet()) {
            System.out.println(key + " occurs " + map.get(key) + " times");
        }
    }
}
/*🔹 Step 0: What is a HashMap?

Think of a HashMap like a dictionary in real life:

Each key is unique. (like a word in a dictionary)

Each value is what is stored with that key (like the definition).

In our case:

Key → the number in the array

Value → how many times it appears (frequency)

Example: {10=3, 20=2, 30=1}

HashMap<Integer, Integer> → first Integer = type of key, second Integer = type of value.

map is empty now {}.

Step 1: Start with empty HashMap
map = {}

Step 2: Process first element 10

Check map → 10 not present → count = 0 + 1 = 1

Update map:

map = {10=1}

Step 3: Process second element 20

Check map → 20 not present → count = 0 + 1 = 1

Update map:

map = {10=1, 20=1}*/
