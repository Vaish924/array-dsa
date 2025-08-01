import java.util.Scanner;

class AddFractions {
    // Function to find GCD
    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Function to add fractions
    static void addFraction(int num1, int den1, int num2, int den2) {
        // Step 1: Find numerator and denominator of result
        int num = num1 * den2 + num2 * den1;
        int den = den1 * den2;

        // Step 2: Reduce fraction using GCD
        int g = gcd(num, den);
        num /= g;
        den /= g;

        // Step 3: Print result
        System.out.println(num + "/" + den);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); // Number of test cases
        while (T-- > 0) {
            int num1 = sc.nextInt();
            int den1 = sc.nextInt();
            int num2 = sc.nextInt();
            int den2 = sc.nextInt();

            addFraction(num1, den1, num2, den2);
        }

        sc.close();
    }
}
