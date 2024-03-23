class Solution 
{
    static Pair getMinMax(long a[], long n)  
    {
        //Write your code here
        Arrays.sort(a);
        return new Pair(a[0],a[a.length-1]);
    }
}
