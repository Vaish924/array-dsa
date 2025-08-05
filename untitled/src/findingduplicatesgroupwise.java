import java.util.ArrayList;
import java.util.List;

public class findingduplicatesgroupwise {

    public static List<Integer> duplicates(int arr[])
    {
        List<Integer> result=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            int index=Math.abs(arr[i])-1;
            if(arr[index]<0)
            {
                result.add(index+1);
            }
            else {
                arr[index]=-arr[index];
            }
        }
        return result;
    }
    public static void main(String args[])
    {
        int arr[]={3,1,2};
        int arr1[]={2,3,1,2,3};
        System.out.println(duplicates(arr));
        System.out.println(duplicates(arr1));
    }
}
