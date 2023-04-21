package com.learnings.leetcode.arrays;
//https://leetcode.com/problems/left-and-right-sum-differences/
import java.util.Arrays;

public class LeftAndRightSumDifferences {

  public static void main(String[] args) {
    LeftAndRightSumDifferences obj = new LeftAndRightSumDifferences();
    System.out.println(Arrays.toString(obj.leftRigthDifference(new int[] { 10, 4, 8, 3 })));
  }

  public int[] leftRigthDifference(int[] nums) {
    //    int[] ans = new int[nums.length];
    int[] leftSum = new int[nums.length];
    int[] rightSum = new int[nums.length];

    int val = 0;
    for (int it : nums) {
      val += it;
    }
    int leftsum = 0;
    int[] ans = new int[nums.length];
    for (int i = 0; i < nums.length; i++) {
      ans[i] = Math.abs((val - leftsum - nums[i]) - leftsum);
      leftsum += nums[i];
    /*for (int i = 0; i < nums.length - 1; i++) {
      leftSum[i + 1] = leftSum[i] + nums[i];
    }
    for (int j = nums.length - 1; j > 0; j--) {
      rightSum[j - 1] = rightSum[j] + nums[j];
    }
    for (int i = 0; i < nums.length; i++) {
      ans[i] = Math.abs(leftSum[i] - rightSum[i]);*/
    }
  
    return ans;
}
  
}
