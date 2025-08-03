public class majority {
    public static int majority(int arr[])
    {
        int candidate=-1;
        int count=0;
        for(int n:arr)
        {
            if(count==0)
            {
                candidate=n;
                count=1;
            }
            if(candidate==n)
            {
                count++;
            }
            else {
                count--;
            }
        }

        for(int n:arr)
        {
            if(candidate==n)
            {
                candidate=n;
                count++;
            }
        }

        if(count>=arr.length/2)
        {
            return candidate;
        }
        else {
            return -1;
        }
    }
    public static void main(String args[])
    {
        int arr[]={1,3,5,1,2,1,4,1,1,1};
        int result=majority(arr);
        System.out.println("majority element is:"+result);
    }
}
