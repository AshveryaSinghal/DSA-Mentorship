import java.util.Scanner;

public class DSA{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter value of n: ");
        int n = scn.nextInt();
        for(int i = 1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }

    }
}
