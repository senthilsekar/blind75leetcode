package com.pss.leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> numbersVisited = new HashMap<>();
        int[] result = {-1, -1};

        for(int i = 0; i<nums.length; i++){
            result[0]= i;
            result[1] = numbersVisited.getOrDefault(target-nums[i],-1);
            if(result[1] > -1){
                return result;
            }else{
                numbersVisited.put(nums[i], i);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int inp[] = {2, 7, 11, 15};
        System.out.println(Arrays.toString(TwoSum.twoSum(inp, 9)));
    }

}
