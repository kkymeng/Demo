package com.kk.algorithm.leetcode;

/**
 * @author yunkk
 * @version 1.0
 * @date 2020/3/19 15:26
 */
public class ArrayMaxSum {
    public int maxSubArray(int[] nums){
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int num:nums){
            if(sum <=0){
                sum = num;
            }else{
                sum+=num;
            }
            max = Math.max(max,sum);
        }
        return max;
    }
}
