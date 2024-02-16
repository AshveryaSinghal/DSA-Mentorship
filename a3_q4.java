//checking rotation of an array 

public class a3_q4 {
    public static boolean check(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1])
                count++;
        }

        if (count == 0)
            return true;
        else if (count > 1)
            return false;
        else if (nums[0] >= nums[nums.length - 1])
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 1, 4 };
        boolean ans = check(nums);
        System.out.println("result is " + ans);
    }
}
