public class removeallsimilaroccurences {

    static int remove(int arr[],int ele)
    {
        int k=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=ele)
            {
                arr[k]=arr[i];
                k++;
            }
        }
        return k;
    }
    public static void main(String args[])
    {
        int arr[]={3,7,2,6,3,3};
        int ele=3;
        System.out.println(remove(arr,ele));
    }
}
