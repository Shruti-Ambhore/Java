public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6};
        int n = 6; // total numbers from 1 to n

        // Step 1: Calculate expected sum of 1 to n
        int totalSum = n * (n + 1) / 2;

        // Step 2: Calculate sum of array elements
        int sum = 0;
        for (int num : arr) sum += num;

        // Step 3: Missing number = totalSum - sum
        int missing = totalSum - sum;
        System.out.println("Missing number is: " + missing);
    }
}

    

