public class day4e2 {
    //write a method to see if the number is prime
    public static void main(String[] args) {
        if (isPrime(12)) {
            System.out.println("Prime");
        }

        else {
            System.out.println("Not Prime");
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

