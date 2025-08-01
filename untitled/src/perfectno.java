class PerfectNo {
    public static boolean find(int n) {
        int sum = 0;

        // Start loop from 1 to n/2 (not 0 to avoid division by zero)
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i; // Add factor to sum
            }
        }

        // Check if sum of factors equals the number
        return sum == n;
    }

    public static void main(String args[]) {
        int n = 21;
        boolean result = find(n);

        System.out.println(result ? "Perfect Number" : "Not Perfect Number");
    }
}
