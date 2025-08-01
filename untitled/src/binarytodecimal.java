import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class binarytodecimal {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a binary no:");
        String b=sc.nextLine();

        int decimal=Integer.parseInt(b,2);
        System.out.println("decimal no of given binary is:"+decimal);

    }
}
