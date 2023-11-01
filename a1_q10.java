import java.util.Scanner;

public class PrimeFactorization {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number (n): ");
        int n = scanner.nextInt();

        System.out.println("Prime factorization of " + n + ":");
        primeFactorization(n);

        scanner.close();
    }

    public static void primeFactorization(int n) {
        for (int factor = 2; factor <= n; factor++) {
            while (n % factor == 0) {
                System.out.println(factor);
                n = n / factor;
            }
        }
    }
}
