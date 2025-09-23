//using function
public class LargestSmallest {
    public static int getlargest(int numbers[]){
        int largest =Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];  // update largestcls

            }
        }
        return largest;
    }
    public static int getsmallest(int numbers[]){
        int smallest =Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i];  // update largestcls

            }
        }
        return smallest;
    }
        public static void main(String[] args) {
        int numbers[] = {12, 5, 7, 89, 45, 2, 77};
        System.out.println("Largest element: " + getlargest(numbers));
        System.out.println("smallest element: " + getsmallest(numbers));
        }

} 

// without function
/*
public class LargestSmallest {
    public static void main(String[] args) {
        int[] arr = {12, 5, 7, 89, 45, 2, 77};

        int largest =Integer.MIN_VALUE;
        int smallest =Integer.MAX_VALUE;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];  // update largestcls

            }
            if (arr[i] < smallest) {
                smallest = arr[i];  // update smallest
            }
        }

        System.out.println("Largest element: " + largest);
        System.out.println("Smallest element: " + smallest);
    }

}
*/
