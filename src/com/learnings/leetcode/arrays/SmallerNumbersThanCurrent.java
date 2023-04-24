package com.learnings.leetcode.arrays;

import java.util.Arrays;
//https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/description/
public class SmallerNumbersThanCurrent {

  public static void main(String[] args) {
    SmallerNumbersThanCurrent obj = new SmallerNumbersThanCurrent();
    int[] ans1 = obj.smallerNumbersThanCurrent(new int[] { 8, 1, 2, 2, 3 });
    System.out.println(Arrays.toString(ans1));
  }

  public int[] smallerNumbersThanCurrent(int[] nums) {
    int[] ams = new int[nums.length];
    for (int i = 0; i < nums.length; i++) {
      int count = 0;
      for (int j = 0; j < nums.length; j++) {
        if (nums[j] < nums[i]) {
          count = count + 1;
          ams[i] = count;
        }
      }
    }
    return ams;
  }
}
