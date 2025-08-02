public class countofsmallerelement {
    public static int smaller(int arr[],int x)
    {
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<=x)
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String args[])
    {
        int arr[]={2,5,7,3,8,9,1,5};
        int x=5;
        int r=smaller(arr,x);
        System.out.println("no of smaller elements:"+r);
    }
}
