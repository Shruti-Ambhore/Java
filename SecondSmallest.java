public class SecondSmallest {
    public static void main(String[] args) {
        int[] arr = {10, 20, 4, 45, 99};

        int smallest = Integer.MAX_VALUE;
        int secondsmallest = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                secondsmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] < secondsmallest && arr[i] != smallest) {
                secondsmallest = arr[i];
            }
        }

        if (secondsmallest == Integer.MIN_VALUE) {
            System.out.println("No second largest element (all elements same)");
        } else {
            System.out.println("Second smallest = " + secondsmallest);
        }
    }
}

