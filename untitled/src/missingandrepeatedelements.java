import java.util.Arrays;
import java.util.List;

public class missingandrepeatedelements {
    public static List<Integer> remove(int arr[])
    {
        int duplicate=-1; int missing=-1;
        for(int i=0;i<arr.length;i++)
        {
         int index=Math.abs(arr[i])-1;

         if(arr[index]<0)
         {
             duplicate=index+1;
         }
         else
         {
             arr[index]=-arr[index];
         }

        }

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>0);
            {
                missing=i+1;
                break;
            }
        }
        return Arrays.asList(duplicate,missing);
    }

    public static void main(String args[])
    {
        int arr[]={1,3,3};
        System.out.println(remove(arr));
    }
}
