public class Jumpingno {
    public static boolean isjumping(int n) {
        if (n < 10) return true; // single digit is jumping
        while (n > 10) {
            int last = n % 10;
            int slast = (n / 10) % 10;
            if (Math.abs(last - slast) != 1) { // FIXED
                return false;
            }
            n = n / 10;
        }
        return true;
    }

    public static void main(String args[]) {
        int n = 47;
        for (int i = n; i >= 0; i--) {
            if (isjumping(i)) {
                System.out.println(i);
                break;
            }
        }
    }
}
