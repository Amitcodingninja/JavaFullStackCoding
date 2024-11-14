package Array;

public class duplicate1 {
    public static void removeDuplicate(int arr[]) {
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print (arr[i] +" ");
                    flag = true;
                    break;
                }
            }
        }

    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 6, 2, 4, 1};
//        boolean foundduplicate = false;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] == arr[j]) {
//                    System.out.print(arr[i] + " ");
//                    foundduplicate = true;
//                    break;
//
//                }
//
//            }
//        }

    removeDuplicate(arr);

    }
}
