import java.util.Scanner;

public class DSA {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        for(int i=1;i<=n;i++){
            int k=i;
            for(int j=1;j<=i;j++){
                System.out.print(j+"");
            }

            for(int j=1;j<=(2*n)-(2*i)-1;j++)
            System.out.print(" ");
            if(i==n){
                k-=1;
            }
            for(int j=k;j>0;j--){
                System.out.print((j)+"");
            }
            
            System.out.println();
        }
        
        scn.close();
    }
}
