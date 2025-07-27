public class oneplus {
    static int[] task(int arr[])
    {
        int n=arr.length;
        int sum=0;
        int carry=1;
        for(int i=n-1;i>=0;i--)
        {
            sum=arr[i]+carry;
            arr[i]=sum%10;
            carry=sum/10;

        }
        if(carry>0)
        {
            int newarr[]=new int[n+1];
            newarr[0]=carry;
            System.arraycopy(arr,0,newarr,1,n);
            return newarr;
        }
        return arr;
    }
    public static void main(String args[])
    {
        int arr[]={9,9,9};
        int res[]=task(arr);
        for(int i:res)
        {
            System.out.print(i);
        }
    }
}
