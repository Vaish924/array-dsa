public class maxindex {
    public static int max(int arr[])
    {
        int l=arr.length;
        int max=Integer.MIN_VALUE;
        int index=-1;
        for(int i=0;i<l;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
                index=i;
            }

        }
        System.out.println("biggest index is:"+index);

        return max;
    }
    public static void main(String args[])
    {
        int arr[]={3,9,2,6};
        int r=max(arr);
        System.out.println(r);
    }
}
