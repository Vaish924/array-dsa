public class lcmandgcd {
    public static int gcd(int a,int b)
    {
        while(b>0)
        {
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;

    }
    public static void main(String args[])
    {
        int a=5;
        int b=10;
        int gcdv=gcd(a,b);
        System.out.println("gcd is:"+gcdv);
        int lcm=(a*b)/gcdv;
        System.out.println("lcm is:"+lcm);
    }
}
