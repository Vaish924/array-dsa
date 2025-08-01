import java.util.Scanner;
public class swap {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value for x and y");
        int x=sc.nextInt();
        int y=sc.nextInt();
        int temp;
        System.out.println("no before swapping" +x+y);
        temp=x;
        x=y;
        y=temp;
        System.out.println("no after swapping "+x+y);

    }
}
