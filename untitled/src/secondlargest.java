import java.util.Arrays;
    public class secondlargest {
        static int secondelement(int arr[])
        {
            int size=arr.length;
            Arrays.sort(arr);
            for(int i=size-2;i>=0;i--)
            {
                if(arr[i]!=arr[size-1])
                {
                    return arr[i];
                }
            }
            return -1;
        }
        public static void main(String args[])
        {
            int arr[]={12,54,32,76,13};
            System.out.println("second largest element is:" +secondelement(arr));
        }
    }

