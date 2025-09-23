import java.util.Arrays;

public class MinDifferenceSimpleSort {
    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 8, 15};

        Arrays.sort(arr); // sort array → [5, 8, 10, 15, 20]

        int minDiff = Integer.MAX_VALUE;

        for (int i = 1; i < arr.length; i++) {
            int diff = arr[i] - arr[i - 1]; // consecutive difference
            if (diff < minDiff) {
                minDiff = diff;
            }
        }

        System.out.println("Minimum Difference = " + minDiff);
    }
}
