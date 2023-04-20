package com.learnings.leetcode.arrays;

import java.util.Arrays;

// https://leetcode.com/problems/build-array-from-permutation/description/

public class BuildArrayFromPermutation {

  public static void main(String[] args) {
    int[] inp = new int[] { 5,0,1,2,3,4 };
    BuildArrayFromPermutation obj = new BuildArrayFromPermutation();
    System.out.println(Arrays.toString(obj.buildArray(inp)));

  }

  public int[] buildArray(int[] nums) {
    int[] ans = new int[nums.length];
    for (int i = 0; i < nums.length; i++) {
      ans[i] = nums[nums[i]];
    }
    return ans;
  }
}
