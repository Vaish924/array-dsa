import java.util.Scanner;

public class npr {
    public static int factorial(int n)
    {
        int fact=1;
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        return fact;
    }

    public static int npr(int n,int r)
    {
        return factorial(n)/factorial(n-r);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter");
        int n=sc.nextInt();
        int r=sc.nextInt();

        if(n<r)
        {
            System.out.println("invalid input");
        }
        else
        {
            System.out.println(npr(n,r));
        }
    }
}
