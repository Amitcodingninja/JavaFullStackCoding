package Array;


import java.util.Arrays;

public class stringSorting {

    public static void main(String[] args) {

        String arr[] = { "Sumit", "Golu", "Polu", "Tofu", "Bhopu" };
        String s[] = bubbleString(arr);
        System.out.println(Arrays.toString(s));

    }

    public static String[] bubbleString(String[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }

            }

        }
        return arr;
    }
}

