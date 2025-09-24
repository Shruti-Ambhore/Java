public class FrequencyCount {
    public static void main(String[] args) {
        int[] arr = {10, 20, 10, 30, 20, 10};

        for (int i = 0; i < arr.length; i++) {
            boolean alreadyCounted = false;

            // check if this number appeared before
            for (int k = 0; k < i; k++) {
                if (arr[i] == arr[k]) {
                    alreadyCounted = true;
                    break;
                }
            }

            if (alreadyCounted) continue; // skip duplicates

            int count = 0;
            // count how many times it appears
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            System.out.println(arr[i] + " occurs " + count + " times");
        }
    }
}
/*
 * 🔹 Comparison: Old Code vs HashMap
Feature	                     Loop-based (Unique Check)	                HashMap
Time Complexity	             O(n²)(nested loops)	                    O(n)(single pass)
Space Complexity	         O(1)	                                    O(n) (extra map)
Ease of Understanding	     Simple but longer code	                    Very clean, short
Best For	                 Small arrays (learning)	                Large arrays / Interviews
 */