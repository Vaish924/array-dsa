public class largestPrime {
    public static int find(int n)
    {
        int  max=-1;
        while(n%2==0)
        {
            max=2;
            n=n/2;
        }

        for(int i=3;i<=n;i+=2)
        {
            while (n%i==0)
            {
                max=i;
                n=n/i;
            }
        }
        return max;
    }
    public static void main(String args[])
    {
        int n=24;
        int result=find(n);
        System.out.println("biggest prime factor is:"+result);
    }
}
