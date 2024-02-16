class Solution
{
	public int peakElement(int[] arr,int n)
    {
        int left=0;
        int right=n-1;
        while(left<right){
            int mid=left+ (right-left)/2;
            if(arr[mid]>arr[mid+1]){
                right=mid;
            }else{
                left=mid+1;
            }
        }
        return left;
      
    }
}

public class a3_q1{
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        Solution solution=new Solution();
        int peakindex=solution.peakElement(arr,arr.length);
        System.out.println("The peak element is "+peakindex);

    }
}
