import java.util.Scanner;

public class DSA {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter odd number: ");
        int n = scn.nextInt();

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                if(j==n-i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}
