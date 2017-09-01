/**
 * Created by hongjingcao on 2017/9/1.
 */
public class Maximum_Subarray_53 {
//    Find the contiguous subarray within an array (containing at least one number) which has the largest sum.
//
//    For example, given the array [-2,1,-3,4,-1,2,1,-5,4],
//    the contiguous subarray [4,-1,2,1] has the largest sum = 6.
//
//    click to show more practice.
//
//    More practice:
//    If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.

    //===========代码===========
    class Solution {
        public int maxSubArray(int[] nums) {
            int max = Integer.MIN_VALUE, sum = 0;
            for (int i = 0; i < nums.length; i++) {
                if (sum < 0)
                    sum = nums[i];
                else
                    sum += nums[i];
                if (sum > max)
                    max = sum;
            }
            return max;
        }
    }
}
