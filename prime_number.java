class Biggest {
    public static void main(String[] args) {
        int a[] = {10, 20, 50, 80};

        for (int i = 0; i <= a.length - 1; i++) {
            if (isPrime(a[i])) {
                System.out.println(a[i] + " is prime number");
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        } else {
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}