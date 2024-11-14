package Array;

import java.util.Arrays;

public class removeDuplicate {
    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 6, 2, 4, 1};
        int[] result = removeDuplicates(arr);

        System.out.println("Array after removing duplicates: " + Arrays.toString(result));
    }

    public static int[] removeDuplicates(int[] arr) {
        // If the array is empty or has only one element, return it as it is
        if (arr == null || arr.length <= 1) {
            return arr;
        }

        // A new array to store the elements without duplicates
        int n = arr.length;
        int[] temp = new int[n];
        int index = 0;

        // Outer loop to go through each element
        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;

            // Inner loop to check if the current element already exists in the temp array
            for (int j = 0; j < index; j++) {
                if (arr[i] == temp[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            // If it's not a duplicate, add it to the temp array
            if (!isDuplicate) {
                temp[index++] = arr[i];
            }
        }

        // Create a new array of the appropriate size and copy the unique elements
        int[] result = Arrays.copyOf(temp, index);
        return result;
    }
}
