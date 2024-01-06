import java.util.Scanner;

public class DSA {
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n=scn.nextInt();
        int k=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(k+" ");
                k++;
            }
            System.out.println();

        }
        scn.close();
    }
}
