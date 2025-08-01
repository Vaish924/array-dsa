import java.util.Scanner;
public class swappingWithoutthirdvariable {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value for x and y");
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.println("no before swap:"+x  +y);
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("no after swap:" +x  +y);
    }
}
