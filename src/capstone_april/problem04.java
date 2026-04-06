//package capstone_april;
//
////cctv footage camera rotation
//// a security office stores the last few camera snapshots in an array
////input : [101,102,103,104,105,106]
//// k=3
//// output : [104,105,106,101,102,103]
//
//public class problem04 {
//    public static void main(String[] args)
//    {
//        int[] arr= {101,102,103,104,105,106};
//        int k=3;
//        rotate(arr,k);
//        System.out.println();
//    }
//    static void rotate(int[] arr, int k)
//    {
//        int n= arr.length;
//        k=
//    }
//}

package capstone_april;

// cctv footage camera rotation
// a security office stores the last few camera snapshots in an array
// input : [101,102,103,104,105,106]
// k = 3
// output : [104,105,106,101,102,103]

public class problem04 {
    public static void main(String[] args) {
        int[] arr = {101, 102, 103, 104, 105, 106};
        int k = 3;
        rotate(arr, k);
        System.out.println();
    }

    static void rotate(int[] arr, int k) {
        int n = arr.length;
        if (n == 0) {
            return;
        }

        // Normalize k so it works for k > n and negative k
        k = ((k % n) + n) % n;

        // Right rotation by k using reversal algorithm
        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    static void reverse(int[] arr, int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
