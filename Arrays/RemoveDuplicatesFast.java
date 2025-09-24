
public class RemoveDuplicatesFast {
    
    public static void main(String[] args) {
        int[] arr = {10, 20, 10, 30, 20, 40};
        int n = arr.length;

        int[] temp = new int[n]; // to store unique elements
        int j = 0; // counter for unique elements

        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;

            // check if arr[i] already exists in temp
            for (int k = 0; k < j; k++) {
                if (arr[i] == temp[k]) {
                    isDuplicate = true;
                    break;
                }
            }

            // if not duplicate, add to temp
            if (!isDuplicate) {
                temp[j] = arr[i];
                j++;
            }
        }

        // print unique elements
        for (int i = 0; i < j; i++) {
            System.out.print(temp[i] + " ");
        }
    }
}

/*"I used a temporary array to store unique elements. For each element in the original array, I check if it already exists in the temporary array. If it doesn’t, I add it. This way I avoid duplicates. The time complexity is O(n²) in the worst case, but it clearly shows the logic. In real-world projects, I’d use a Set or Streams to make it more efficient and cleaner." */
/*import java.util.*;

public class RemoveDuplicatesSimple {
    public static void main(String[] args) {
        int[] arr = {10, 20, 10, 30, 20, 40};

        // Use Set (it automatically removes duplicates)
        Set<Integer> set = new LinkedHashSet<>();

        for (int num : arr) {
            set.add(num);
        }

        // Print unique elements
        for (int num : set) {
            System.out.print(num + " ");
        }
    }
}
Set in Java does not allow duplicates.

LinkedHashSet also keeps the order of elements as they appear in the array.

So the output for {10, 20, 10, 30, 20, 40} will be: */