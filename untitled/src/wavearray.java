public class wavearray {
    static void check(int arr[])
    {
        int n=arr.length;
        for(int i=0;i<n;i+=2)
        {
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
    }
    public static void main(String args[])
    {
        int arr[]={2,7,4,6,9,1};
        check(arr);
        for(int num:arr)
        {
            System.out.println(num);
        }
    }
}
