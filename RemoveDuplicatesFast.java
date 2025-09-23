import java.util.HashMap;

public class RemoveDuplicatesFast {
    public static void main(String[] args) {
        int[] arr = {10, 20, 10, 30, 20, 40};

        HashMap<Integer, Boolean> map = new HashMap<>();

        // Step 1: Add elements to map (keys are unique)
        for (int num : arr) {
            map.put(num, true); // value doesn't matter
        }

        // Step 2: Print unique elements
        for (int key : map.keySet()) {
            System.out.print(key + " ");
        }
    }
}
