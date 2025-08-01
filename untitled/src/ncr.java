import java.util.Scanner;
public class ncr {
    public static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    // Function to calculate nCr
    public static int nCr(int n, int r) {
        if (r > n) return 0;  // If r > n, return 0

        return factorial(n) / (factorial(r) * factorial(n - r));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.print("Enter r: ");
        int r = sc.nextInt();

        // Output
        System.out.println("nCr = " + nCr(n, r));

        sc.close();
    }
}
