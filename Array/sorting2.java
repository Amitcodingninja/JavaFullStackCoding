package Array;

import java.util.*;

class TestClass {
    public static void main(String args[]) throws Exception {
        // Reading input using Scanner
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // Size of the array
        int p = 0;             // Counter for number of passes
        boolean swapped;       // Flag to check if any swapping occurred

        int arr[] = new int[n]; // Array to store the elements

        // Reading the elements into the array
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Bubble sort logic
        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap elements if they are in the wrong order
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            p++; // Increment pass count
            if (!swapped) {
                break; // Break early if no elements were swapped (array is sorted)
            }
        }

        // Output the number of passes
        System.out.println(p);
    }
}
