import java.util.Scanner;

public class InverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String number = scanner.next();

        String inverse = calculateInverse(number);

        System.out.println("Inverse of " + number + " is " + inverse);

        scanner.close();
    }

    public static String calculateInverse(String number) {
        int length = number.length();
        char[] inverse = new char[length];

        for (int i = 0; i < length; i++) {
            char digit = number.charAt(i);
            int position = length - Character.getNumericValue(digit);
            inverse[position - 1] = digit;
        }

        return new String(inverse);
    }
}
