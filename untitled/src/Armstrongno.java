import java.util.Scanner;

public class Armstrongno {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a three digit no:");
        int num=sc.nextInt();
        int original=num;
        int sum=0;
        while(num>0)
        {
            int digit=num%10;
            sum=sum+digit*digit*digit;
            num=num/10;

        }
        if(original==sum)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }
}
