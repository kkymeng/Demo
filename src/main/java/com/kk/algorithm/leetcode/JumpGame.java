package com.kk.algorithm.leetcode;

/***
 * 55
 * 给定一个非负整数数组，你最初位于数组的第一个位置。
 *
 * 数组中的每个元素代表你在该位置可以跳跃的最大长度。
 *
 * 判断你是否能够到达最后一个位置。
 */
public class JumpGame {
    public static void main(String[] args) {
        JumpGame jumpGame = new JumpGame();
        int[] nums =new int[]{2,3,1,1,4};
        System.out.println(jumpGame.canJump(nums));
    }

    public boolean canJump2(int[] nums){
        int maxLength = 0; //初始化最远长度
        for(int i=0 ; i<nums.length;i++){
            if(i>maxLength){
                return false;
            }
            maxLength = Math.max(maxLength,nums[i]+i);
            if(maxLength>=nums.length-1){
                return true;
            }
        }
        return true;
    }
    /**
     * 回溯法
     * @param nums
     * @return
     */
    public boolean canJump(int[] nums) {
        return canJumpFromPosition(0, nums);

    }
    public boolean canJumpFromPosition(int position, int[] nums) {
        if (position == nums.length - 1) {
            return true;
        }

        int furthestJump = Math.min(position + nums[position], nums.length - 1);
        for (int nextPosition = position + 1; nextPosition <= furthestJump; nextPosition++) {
            if (canJumpFromPosition(nextPosition, nums)) {
                return true;
            }
        }

        return false;
    }
}
