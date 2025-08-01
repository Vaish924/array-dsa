import java.util.Scanner;

public class kthdigit {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int k=sc.nextInt();

        long power=(long) Math.pow(a,b);
        for(int i=1;i<k;i++)
        {
            power=power/10;
        }
        long kth=power%10;
        System.out.println("kth term is:"+kth);
    }
}
