import java.util.Scanner;
public class Primeno {
    public static void main(String args[])
    {
        boolean isPrime=true;
        int temp;
        Scanner sc=new Scanner(System.in);
        System.out.println("entre no:");
        int num=sc.nextInt();

        for(int i=2;i<=num/2;i++)
        {
            if(num%i==0)
            {
                isPrime=false;
                break;
            }
        }
        if(isPrime)
        {
            System.out.println("no is prime");

        }
        else
        {
            System.out.println("no is not prime");
        }
    }
}
