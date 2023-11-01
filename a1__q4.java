import java.util.Scanner;

public class PrimeNumbersInRange {
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num <= 3) {
            return true;
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }

        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }

    public static void printPrimesInRange(int low, int high) {
        for (int number = low; number <= high; number++) {
            if (isPrime(number)) {
                System.out.println(number);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the lower limit of the range: ");
        int low = scanner.nextInt();

        System.out.print("Enter the upper limit of the range: ");
        int high = scanner.nextInt();

        System.out.println("Prime numbers in the range from " + low + " to " + high + ":");
        printPrimesInRange(low, high);

        scanner.close();
    }
}
