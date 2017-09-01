/**
 * Created by hongjingcao on 2017/9/1.
 */
public class Single_Element_in_a_Sorted_Array_540 {
//    Given a sorted array consisting of only integers where every element appears twice except for one element which appears once. Find this single element that appears only once.
//
//    Example 1:
//    Input: [1,1,2,3,3,4,4,8,8]
//    Output: 2
//    Example 2:
//    Input: [3,3,7,7,10,11,11]
//    Output: 10
//    Note: Your solution should run in O(log n) time and O(1) space.

    //===========代码===========
    class Solution {
        public int singleNonDuplicate(int[] nums) {
            int single = 0;
            for(int i=0;i<nums.length;i++){
                if (i == nums.length-1){
                    single = nums[nums.length-1];
                    break;
                }else {
                    if(nums[i]!=nums[i+1]){
                        single = nums[i];
                        break;
                    }else if (nums[i] == nums[i+1]){
                        i++;
                    }
                }

            }
            return single;
        }
    }
}
