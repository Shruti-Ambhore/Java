public class FindDuplicate {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 2, 5};  //{1, 3, 4, 2, 4, 6};Here the array contains 6, which is outside 1 to n. So the formula breaks, because sum no longer matches the assumption.
        int n = arr.length - 1; // numbers from 1 to n

        // Step 1: Calculate expected sum of 1 to n
        int totalSum = n * (n + 1) / 2;

        // Step 2: Calculate sum of array elements
        int sum = 0;
        for (int num : arr) sum += num;

        // Step 3: Duplicate = sum - totalSum
        int duplicate = sum - totalSum;
        System.out.println("Duplicate number is: " + duplicate);
    }
}
