// Given an integer array nums, find the subarray with the largest sum, and return its sum.
// The idea is to implement kadane's Algorithm to solve this.

public class KadanesAlgo {

    public static int maxSubArray(int[] nums) {
        int ans = nums[0];
        int curr_min = nums[0];
        for(int i = 1;i<nums.length;i++){
            curr_min = Math.max(nums[i],nums[i]+curr_min);
            ans = Math.max(ans, curr_min);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int result = maxSubArray(nums);
        System.out.println("Maximum Subarray Sum: " + result);
    }
}
