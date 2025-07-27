
public class reversearrayingroup {
    static void find(int arr[],int k)
    {
        int n=arr.length;
        for(int i=0;i<n;i+=k)
        {
            int left=i;
            int rigth=Math.min(i+k-1,n-1);

            while(left<rigth)
            {
                int temp=arr[left];
                arr[left]=arr[rigth];
                arr[rigth]=temp;
                left++;
                rigth--;
            }
        }
    }
    public static void main(String args[])
    {
        int arr[]={3,7,5,9,2,5,7};
        int k=3;
        find(arr,k);
        for(int num:arr)
        {
            System.out.println(num);
        }
    }
}
