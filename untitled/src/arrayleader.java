import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class arrayleader {
    public static ArrayList<Integer> find(int arr[])
    {
        ArrayList<Integer> leader=new ArrayList<>();
        int n=arr.length;
        int rightmax=arr[n-1];
        leader.add(rightmax);

        for(int i=n-2;i>=0;i--)
        {
            if(arr[i]>=rightmax)
            {
                leader.add(arr[i]);
                rightmax=arr[i];
            }
        }
       /* Collections.reverse(leader);*/
        return leader;

    }
    public static void main(String args[])
    {
        int arr[]={9,4,5,6,2,1};
        System.out.println(find(arr));
    }
}
