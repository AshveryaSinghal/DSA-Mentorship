import java.util.Scanner;

public class ReverseDisplayDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        System.out.println("Digits of the number " + n + " in reverse order:");

        // Extract and print digits in reverse
        while (n != 0) {
            int digit = n % 10;
            System.out.println(digit);
            n /= 10;
        }

        scanner.close();
    }
}
