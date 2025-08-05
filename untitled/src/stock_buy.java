public class stock_buy {
    public static int profit(int arr[])
    {
        int result=0;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>arr[i-1])
            {
                result+=arr[i]-arr[i-1];
            }
        }
        return result;
    }
    public static void main(String args[])
    {
        int arr[]={100, 180, 260, 310, 40, 535, 695};
        System.out.println("profit is:"+profit(arr));
    }
}
