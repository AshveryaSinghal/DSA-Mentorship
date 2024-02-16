 class Solution {
    public void moveZeroes(int[] nums) {
            for(int i = 0; i<nums.length; i++){
                if(nums[i] != 0){
                    System.out.print(nums[i]);
                }
            }
            for(int j = 0; j<nums.length; j++){
                if(nums[j] == 0){
                    System.out.print(nums[j]);
                }
            }
    }
}


