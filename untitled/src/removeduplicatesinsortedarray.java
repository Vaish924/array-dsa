import java.util.HashSet;

public class removeduplicatesinsortedarray {
    static int remove(int arr[])
    {
        int idx=0;
        HashSet<Integer> s=new HashSet<>();
        for(int i=0;i<arr.length;i++)
        {
            if(!s.contains(arr[i]))
            {
                s.add(arr[i]);
                arr[idx++]=arr[i];
            }
        }
        return idx;
    }
    public static void main(String args[])
    {
        int arr[]={2,2,3,3,3,3,5,5,7,7,7,7,8};
        int newsize=remove(arr);
        for(int i=0;i<newsize;i++)
        {
            System.out.println(arr[i]+" ");
        }
    }
}
