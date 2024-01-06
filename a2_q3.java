
import java.util.Scanner;
public class DSA {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("enter number of rows");
        int n=scn.nextInt();
        int spaces=n-1;
        int stars=1;
        for(int i=1;i<=n;i++){ 
            for(int j=1;j<=spaces;j++){ 
                System.out.print(" ");
            }
            for(int j=1;j<=stars;j++){
                System.out.print("*");
            }
            spaces--;
            stars++;
            System.out.println();
        }

    }
}
