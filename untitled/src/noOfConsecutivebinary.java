import java.util.*;
public class noOfConsecutivebinary {
    static int tofind(int arr[])
    {
         if(arr.length==0)
         {
             return 0;
         }
         int maxCount=0;
         int count=1;

         for(int i=1;i< arr.length;i++)
         {
             if(arr[i]==arr[i-1])
             {
                 count++;
             }
             else {
                 int max=Math.max(maxCount,count);
                 count=1;
             }
         }
         return Math.max(maxCount,count);
    }
    public static void main(String args[])
    {
        int arr[]={0,0,1,0,1,1,1,1};

        System.out.println("max count is:" +tofind(arr));
    }
}
