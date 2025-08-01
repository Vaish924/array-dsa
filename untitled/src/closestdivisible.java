import java.util.*;
public class closestdivisible {
    public static void main(String args[])
    {
        int n=14;
        int m=4;
        int q=n/m;

        int n1=m*q;
        int n2=m>0?m*(q+1):m*(q-1);

        if(Math.abs(n-n1)<Math.abs(n-n2))
        {
            System.out.println("the correct no is:"+n1);
        }
        else if(Math.abs(n-n1)>Math.abs(n-n2))
        {
            System.out.println("the correct no is:"+n2);
        }
        else {
            if(Math.abs(n1)>Math.abs(n2))
            {
                System.out.println(n1);
            }
            else {
                System.out.println(n2);
            }
        }
    }
}
