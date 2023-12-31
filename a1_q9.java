import java.util.Scanner;

public class GCDandLCM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number (num1): ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number (num2): ");
        int num2 = scanner.nextInt();

        int gcd = findGCD(num1, num2);
        int lcm = findLCM(num1, num2);

        System.out.println("GCD of " + num1 + " and " + num2 + " is " + gcd);
        System.out.println("LCM of " + num1 + " and " + num2 + " is " + lcm);

        scanner.close();
    }

    public static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findGCD(b, a % b);
    }

    public static int findLCM(int a, int b) {
        return (a * b) / findGCD(a, b);
    }
}
