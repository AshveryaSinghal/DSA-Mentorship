import java.util.* ;
import java.io.*; 

public class a3_q8{

    static int largestElement(int[] arr, int n) {
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i<n; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        return largest;

    }
}