import java.util.*;

public class RearrangeArray {
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 5, 3, 6};
        rearrangeIncDec(arr);
        // Print result
        System.out.println(Arrays.toString(arr));
    }

    public static void rearrangeIncDec(int[] arr) {
        Arrays.sort(arr);  // Step 1: Sort ascending
        int n = arr.length;
        int[] result = new int[n];
        int mid = n / 2;
        // Step 2: Copy first hal in order
        for (int i = 0; i < mid; i++) {
            result[i] = arr[i];
        }
        // Step 3: Copy second half in reverse
        int index = mid;
        for (int i = n - 1; i >= mid; i--) {
            result[index++] = arr[i];
        }
        // Copy result back to original array
        for (int i = 0; i < n; i++) {
            arr[i] = result[i];
        }
    }
}
