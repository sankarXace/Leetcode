/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int index[] = new int[2];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if (i==j){
                    continue;
                }
                if(nums[i]+nums[j]==target){
                     index[0] = i;
                    index[1]= j;
                    
                }
            }
            
        }return index;
    }
}
// @lc code=end

