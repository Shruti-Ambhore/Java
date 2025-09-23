// best code for secondlargest second smallest prefer this code
import java.util.Arrays;

public class SecondLargestSmallest {
    public static void main(String[] args) {
        int[] arr = {10, 20, 5, 30, 15};

        Arrays.sort(arr); // sort array → ascending

        int secondSmallest = arr[1]; // second element
        int secondLargest = arr[arr.length - 2]; // second last element

        System.out.println("Second Smallest = " + secondSmallest);
        System.out.println("Second Largest = " + secondLargest);
    }
}
