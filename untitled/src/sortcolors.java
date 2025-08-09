import java.util.Arrays;

class SortColors {
    public static void find(int arr[]) {
        int low = 0, mid = 0, high = arr.length - 1;
        while (mid <= high) {
            if (arr[mid] == 0) {
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                int temp = arr[high];
                arr[high] = arr[mid];
                arr[mid] = temp;
                high--;
            }
        }
    }

    public static void main(String args[]) {
        int arr[] = {0, 2, 1, 0, 1, 2};
        find(arr);
        System.out.println(Arrays.toString(arr));
    }
}
