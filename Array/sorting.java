package Array;

public class sorting {

    public static void Sorting(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; i++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int m : arr) {
            System.out.print(m + " ");
        }

    }


    public static void main(String[] args) {
        int[] arr = {2, 1, 4, 1, 5, 3, 7};
        int[] arr2 = {2, 1, 4, 1, 5, 3, 7};

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }
        for (int m : arr) {
            System.out.print(m +" ");
        }
        Sorting(arr2);


    }

//    public static void Sorting(int[] arr) {
//        for (int i = 0; i < arr.length - 1; i++) {
//            for (int j = 0; j < arr.length - 1 - i; j++) { // Correct inner loop to avoid checking already sorted elements
//                if (arr[j] > arr[j + 1]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//            }
//        }
//        // Printing the sorted array
//        for (int m : arr) {
//            System.out.print(m + " ");
//        }
//    }
//
//    public static void main(String[] args) {
//        int[] arr = {2, 1, 4, 1, 5, 3, 7};
//
//        // Call Sorting method to sort the array
//        Sorting(arr);
//    }

}
