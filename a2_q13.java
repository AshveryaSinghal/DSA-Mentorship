import java.util.Scanner;

public class DSA {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = scn.nextInt();
        

        for (int i = 0; i < n; i++) {
           int a = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(a + " ");
                a = a * (i - j) / ( j + 1);
                
            }
            System.out.println();
        }
    }

}
