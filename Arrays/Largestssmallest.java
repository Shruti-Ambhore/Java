public class Largestssmallest{
    public static void main(String[] args) {
        int[] arr = {12, 5, 7, 99, 45, 22, 77};

        int max = arr[0]; /*An integer variable max is declared and initialized with the first element of the array (arr[0]), which is 12. This acts as the initial assumption for the largest value. */
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {    
                max = arr[i];  // update largest
            }
            if (arr[i] < min) {
                min = arr[i];  // update smallest
            }
        }

        System.out.println("Largest element: " + max);
        System.out.println("Smallest element: " + min);
    }
}
//arr[i] → means take each element of the array one by one.
//chatgpt method 
