
public class SumAndAverage {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        int sum = 0;
        
        for (int i = 0; i < arr.length; i++) {
             sum = sum + arr[i]; 
        }

        double average = (double) sum/arr.length;// The average is calculated here, after the loop// and after the sum is complete.

        System.out.println("Sum of elements: " + sum);
        System.out.println("Average of elements: " + average);
    }
}


/*public class SumAndAverage {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        int sum = 0;
        for (int num : arr) {  // enhanced for loop
            sum += num;
        }

        double average = (double) sum / arr.length;

        System.out.println("Sum of elements: " + sum);
        System.out.println("Average of elements: " + average);
    }
}


/*int num : arr → “Take each element from array arr and store it in variable num.”

First iteration → num = 10

Second iteration → num = 20

Third iteration → num = 30 … and so on.

👉 sum += num; → same as sum = sum + num;
So:

When num = 10, sum = 0 + 10 = 10

When num = 20, sum = 10 + 20 = 30

When num = 30, sum = 30 + 30 = 60 … and so on. */

//Why this happens:  package Arrays;

/*In your project structure, the file SumAndAverage.java is inside the folder Arrays.

In Java, if a class file is inside a folder (package), you must declare the package name at the top of the file.

But in your code, there is no package declaration.
That’s why Java is expecting package Arrays; but it is missing.*/
