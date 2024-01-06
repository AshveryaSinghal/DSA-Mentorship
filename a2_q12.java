import java.util.Scanner;

public class DSA {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = scn.nextInt();
        int a = 0, b = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(a + " ");
                int k = a + b;
                a = b;
                b = k;
            }
            System.out.println();
        }
    }

}
