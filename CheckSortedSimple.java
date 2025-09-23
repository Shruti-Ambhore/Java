public class CheckSortedSimple {
    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20}; // change array to test

        boolean ascending = true;
        boolean descending = true;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) ascending = false;
            if (arr[i] < arr[i + 1]) descending = false;
        }

        if (ascending) {
            System.out.println("Array is sorted in ascending order");
        } else if (descending) {
            System.out.println("Array is sorted in descending order");
        } else {
            System.out.println("Array is not sorted");
        }
    }
}
