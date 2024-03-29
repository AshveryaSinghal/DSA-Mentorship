
class Pair  
{  
    long first, second;  
    public Pair(long first, long second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
} 

public class a3_q2
{
    static Pair getMinMax(long a[], long n)  
    {
        long min = a[0];
        long max = a[0];
        
        for(int i = 1; i < n; i++) {
            if (a[i] < min) {
                min = a[i];
            } else if (a[i] > max) {
                max = a[i];
            }
        }
        return new Pair(min, max);
    }

    public static void main(String[] args) {
        long[] arr = {1, 3, 5, 4, 2}; 
        Pair result = getMinMax(arr, arr.length);
        System.out.println("Minimum: " + result.first + ", Maximum: " + result.second);
    }
}
