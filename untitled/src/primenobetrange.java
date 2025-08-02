public class primenobetrange {
    public static boolean isPrime(int n)
    {
        if(n<0)
        {
            return false;
        }
        if(n==2)
        {
            return true;
        }
        if(n%2==0)
        {
            return false;
        }

        for(int i=3;i<Math.sqrt(n);i+=3)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }

    public static int printing(int n)
    {
        int sum=0;
        for(int i=2;i<=n;i++)
        {
            if(isPrime(i))
            {
                sum+=i;
            }
        }
        return sum;
    }
    public static void main(String args[])
    {
        int n=10;
        int r=printing(n);
        System.out.println("sum from 1 to" +n+"is:"+ r);
    }
}
