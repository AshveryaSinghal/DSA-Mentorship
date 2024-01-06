
import java.util.Scanner;
public class pattern_4 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("enter number of rows");
        int n=scn.nextInt();
        for(int i=1;i<=n;i++){ 
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=i;j<=n;j++){
                System.out.print("*");
            }
           
            System.out.println();
        }

    }
}
