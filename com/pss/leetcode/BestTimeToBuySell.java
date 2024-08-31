package com.pss.leetcode;

public class BestTimeToBuySell {

    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int movingProfit;
        int minPrice = -1;
        for(int i=0;i<prices.length;i++) {
            if(minPrice == -1){
                minPrice = prices[i];
            }
            movingProfit = prices[i]-minPrice;
            if(maxProfit < movingProfit){
                maxProfit = movingProfit;
            }
            if(minPrice > prices[i]){
                minPrice = prices[i];
            }
        }

        return maxProfit;

    }

    public static void main(String[] args) {
        int[] input = {7,1,5,3,6,4};
        System.out.println(BestTimeToBuySell.maxProfit(input));
    }
}
