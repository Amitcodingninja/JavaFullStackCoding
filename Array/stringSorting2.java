package Array;
import java.util.*;

public class stringSorting2 {

    public static void main(String[] args) {
        String arr[] = { "Sumit", "Golu", "Polu", "Tofu", "Bhopu" };
        String s[] = selectionSort(arr);
        System.out.println(Arrays.toString(s));
    }

    public static String[] selectionSort(String[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i; // Assume the first element of unsorted part is the smallest
            for (int j = i + 1; j < n; j++) {
                if (arr[j].compareTo(arr[minIndex]) < 0) {
                    minIndex = j; // Update minIndex if a smaller element is found
                }
            }

            // Swap the found minimum element with the first element of the unsorted part
            String temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        return arr;
    }
}
