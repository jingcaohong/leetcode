/**
 * Created by hongjingcao on 2017/9/2.
 */
public class House_Robber_198 {

//    You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security system connected and it will automatically contact the police if two adjacent houses were broken into on the same night.
//
//    Given a list of non-negative integers representing the amount of money of each house, determine the maximum amount of money you can rob tonight without alerting the police.
//
//            Credits:
//    Special thanks to @ifanchu for adding this problem and creating all test cases. Also thanks to @ts for adding additional test cases.
//

    //===========代码===========
    class Solution {
        public int rob(int[] nums) {
            //第一种方法
            int prevNo = 0;
            int prevYes = 0;
            for (int n : nums) {
                int temp = prevNo;
                prevNo = Math.max(prevNo, prevYes);
                prevYes = n + temp;
            }
            return Math.max(prevNo, prevYes);


            //第二种方法
            // int[][] dp = new int[nums.length + 1][2];
            // for (int i = 1; i <= nums.length; i++) {
            //     dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1]);
            //     dp[i][1] = nums[i - 1] + dp[i - 1][0];
            // }
            // return Math.max(dp[nums.length][0], dp[nums.length][1]);
        }
    }
}
