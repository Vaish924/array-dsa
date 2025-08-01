import java.util.Scanner;

public class pallindrome {
    public static void main(String args[])
    {

        String reversed="";
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string or no");
        String original=sc.nextLine();
        int length=original.length();

        for(int i=length-1;i>=0;i--)
        {
            reversed+=original.charAt(i);
        }
        if(original.equals(reversed))
        {
            System.out.println("its pallindrome");

        }
        else
        {
            System.out.println("its not pallindrome");
        }
    }
}

//2nd way
import java.util.Scanner;

public class Palindrome {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string or number:");
        String original = sc.nextLine();

        String reversed = new StringBuilder(original).reverse().toString();

        if (original.equals(reversed))
            System.out.println("It's a palindrome");
        else
            System.out.println("It's not a palindrome");
    }
}
