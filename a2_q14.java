import java.util.Scanner;

public class DSA {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = scn.nextInt();
        System.out.println("Enter the number of which we need to print table: ");
        int x = scn.nextInt();
        int a = 1;
        for (int i = 1; i <= n; i++) {
                int k = x * a;
                System.out.print( x + "*" + a + "=" + k);
            a++;
            System.out.println();
        }
    }

}
