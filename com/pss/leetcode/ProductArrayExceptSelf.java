package com.pss.leetcode;

import java.util.Arrays;

public class ProductArrayExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];

        int left = 1;
        for(int i=0;i<nums.length;i++){
            if(i==0){
                result[0] = 1;   //Left of the first element will be none
                continue;
            }

            result[i] = left * nums[i-1];
            left = left * nums[i-1];


        }

        int right = 1;
        for(int i=(nums.length-1); i>=0; i--){
            if(i==nums.length-1){
                continue;     //right of the last element will be none
            }
            right = right * nums[i+1];
            result[i] = right * result[i];

        }

        return result;
    }

    public static void main(String[] args) {
        int[] input = {1,2,3,4};
        Arrays.stream(ProductArrayExceptSelf.productExceptSelf(input)).forEach(System.out::println);
    }
}
