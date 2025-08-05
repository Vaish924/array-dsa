import java.util.Arrays;
public class productofarray {
    public static int[] productExceptSelf(int[] arr) {
        int n = arr.length;
        int[] res = new int[n];


        int prefix = 1;
        for (int i = 0; i < n; i++) {
            res[i] = prefix;
            prefix *= arr[i];
        }

        int suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            res[i] *= suffix;
            suffix *= arr[i];
        }

        return res;
    }
    public static void main(String args[])
    {
        int arr[]={3,6,8,4,5};
        int[] result = productExceptSelf(arr);
        System.out.println(Arrays.toString(result));
    }
}
