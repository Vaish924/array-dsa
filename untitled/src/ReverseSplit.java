import java.util.Scanner;

public class ReverseSplit {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string");
        String str = sc.nextLine();

        if (str.length() == 0) {
            System.out.println("String is empty. Cannot reverse.");
        } else {
            for (int i = str.length() - 1; i >= 0; i--) {
                System.out.println(str.charAt(i));
            }
        }
    }
}
