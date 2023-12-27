public class PrimeNumber {
    public static void main(String[] args) {
        checkPrime(99);
    }

    public static void checkPrime(int x) {
        int i, m = 0, flag = 0;
        m = x / 2;
        if (x == 0 || x == 1) {
            System.out.println("number is not prime");
        } else {
            for (i = 2; i <= m; i++) {
                if (x % i == 0) {
                    System.out.println(" is not prime number");
                    flag = 1;
                    break;
                }
            }
            if (flag==0) {
                System.out.println("number is prime");
            }
        }
    }

}
