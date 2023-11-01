import java.util.Scanner;

public class RotateNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number (n): ");
        int n = scanner.nextInt();
        System.out.print("Enter the number of rotations (k): ");
        int k = scanner.nextInt();

        int rotatedNumber = rotateRight(n, k);

        System.out.println("Rotated number: " + rotatedNumber);

        scanner.close();
    }

    public static int rotateRight(int n, int k) {
        int numDigits = (int) Math.log10(n) + 1;
        k = k % numDigits; // Ensure k is within the range of the number of digits
        
        if (k < 0) {
            k += numDigits; // Convert negative k to a positive equivalent
        }
        
        int rightPart = n % (int) Math.pow(10, k);
        int leftPart = n / (int) Math.pow(10, k);

        int rotatedNumber = (rightPart * (int) Math.pow(10, numDigits - k)) + leftPart;

        return rotatedNumber;
    }
}
