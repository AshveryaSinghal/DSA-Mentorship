class Solution {
    public void move0(int[] nums) {
        ArrayList<Integer> res=new ArrayList<>();
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0 )
            {
                res.add(nums[i]);
            }
            else
            count++;
        }
        for(int i=0;i<nums.length-count;i++){
            nums[i]=res.get(i);
        }
        for(int i=nums.length-count;i<nums.length;i++)
        nums[i]=0;
    
    }
}
