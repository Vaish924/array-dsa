public class arrayminmax {
    public static int[] find(int arr[])
    {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
       for(int i=0;i<arr.length;i++)
       {
           if(arr[i]>max)
           {
               max=arr[i];
           }
           if(arr[i]<min)
           {
               min=arr[i];
           }
       }
       return new int[]{max,min};
    }
    public static void main(String args[])
    {
        int arr[]={2,6,8,4,6,9};
        int r[]=find(arr);
        System.out.println("max is:"+r[0]);
        System.out.println("min is:"+r[1]);
    }
}
