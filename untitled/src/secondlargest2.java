import java.util.Arrays;
public class secondlargest2 {
    public static int second(int arr[])
    {
        int n=arr.length;
        Arrays.sort(arr);
        for(int i=n-2;i>=0;i--)
        {
            if(arr[i]!=arr[n-1])
            {
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String args[])
    {
        int arr[]={2,6,4,8,3};
        int r=second(arr);
        System.out.println("second largest element is:"+r);
    }
}
