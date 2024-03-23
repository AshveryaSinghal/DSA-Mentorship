class Solution {
    public int missingNumber(int[] nums) {
     int len=nums.length;
     Arrays.sort(nums);
     int i;
     for(i=0;i<len;i++){
         if(i==nums[i])
         continue;
         else
         break;
     }
     return i;
    }
}
