public class moveallzerostoend {

    static void move(int arr[])
    {
        int n=arr.length;
        int temp[]=new int[n];
        int j=0;
        for(int i=0;i<n;i++)
        {
           if(arr[i]!=0)
           {
               temp[j++]=arr[i];
           }
        }
        while(j<n)
        {
            temp[j++]=0;
        }
        for(int i=0;i<n;i++)
        {
            arr[i]=temp[i];
        }

    }
    public static void main(String args[])
    {
        int arr[]={2,0,4,6,0,1,0};
       move(arr);
       for(int n:arr)
       {
           System.out.println("new array elements:" +n);
       }
    }
}
