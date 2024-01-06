
import java.util.Scanner;

public class DSA {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter odd number: ");
        int n = scn.nextInt();
        if (n % 2 == 0) {
            System.out.println("Please enter an odd number ");
            return;
        }

        reverseDiamond(n);
    }

    static void reverseDiamond(int n) {
        int h = n / 2; 
        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= h + 1 - i; j++) {
                System.out.print("*");

            }
            for (int j = 1; j <= (2 * i) + 1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= h + 1 - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0;i<=h;i++){
            for(int j=1;j<=i+1;j++){
                System.out.print("*");
            }
            for(int j=1;j<=2*(h-i)+1;j++){
                System.out.print(" ");
            }
            for(int j=1;j<i+2;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
