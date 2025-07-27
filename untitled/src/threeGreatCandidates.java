//multiplication of three largest no
import java.util.*;
public class threeGreatCandidates {
    static int multi(int arr[])
    {
        int n=arr.length;
        int res=Integer.MIN_VALUE;

        for(int i=0;i<n-2;i++)
        {
            for(int j=i+1;j<n-1;j++)
            {
                for(int k=j+1;k<n;k++)
                {
                    res=Math.max(res,arr[i]*arr[j]*arr[k]);
                }
            }
        }
        return res;
    }
    public static void main(String args[])
    {
        int arr[]={2,6,5,9,2};
        int res=multi(arr);
        System.out.println("the highest product is:" +res);

    }
}
