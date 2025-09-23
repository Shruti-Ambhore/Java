/*reverse an array → means last element becomes first, first becomes last.
Example:
Input → 10 20 30 40 50
Output → 50 40 30 20 10 */

/* 
public class ReverseArraySimple {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        System.out.println("Reversed Array: ");
        for (int i = arr.length - 1; i>= 0; i--) {  // The loop should start at the last index (length - 1) // and decrement down to index 0.
            System.out.print(arr[i] + " ");  
        }
    }
}
*/
public class ReverseArraySimpleSwap {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        int start = 0;              // first index
        int end = arr.length - 1;   // last index

        while (start < end) {
            int temp = arr[start];   // swap
            arr[start] = arr[end];
            arr[end] = temp;

            start++;  // move forward
            end--;    // move backward
        }

        System.out.println("Reversed Array: ");  /*OUTPUT*** Reverse array: 50 40 30 20 10 */
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
       /* for (int i = 0; i < arr.length; i++) {  **OUTPUT** reverse array:50 reverse array:40 reverse array:30 reverse array:20 reverse array:10 
            System.out.print("Reversed Array : "+arr[i] + " "); */
    }
}

/*using for loop
 *  int start = 0;
        int end = arr.length -1 ;
        for(int i=0;i<arr.length;i++){
            if(start<end){
                int temp = arr[start];   // swap
                arr[start] = arr[end];
                arr[end] = temp;

            start++;  // move forward
            end--;    // move backward
            }
        }
 */