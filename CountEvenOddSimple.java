public class CountEvenOddSimple {
    public static void main(String[] args) {
        int[] arr = {12, 5, 7, 8, 10, 13};

        int even = 0; // counter for even numbers
        int odd = 0;  // counter for odd numbers

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even++;   // increase even count
            } else {
                odd++;  //odd = odd + 1;    // increase odd count
            }
        }

        System.out.println("Even = " + even);
        System.out.println("Odd = " + odd);
    }
}
