package com.learnings.leetcode.arrays;

import java.util.Arrays;

public class ShufflngTheArray {
//https://leetcode.com/problems/shuffle-the-array/
  public static void main(String[] args) {
    ShufflngTheArray obj = new ShufflngTheArray();
    System.out.println(Arrays.toString(obj.shuffle(new int[] { 2, 5, 1, 3, 4, 7 },3)));

  }

  public int[] shuffle(int[] nums, int n) {
    int[] answer = new int[nums.length];
    int lp = 0;
    int rp = n;
    int loop = 0;
    int index = 0;
    while (loop < n) {
      answer[index++] = nums[lp++];
      answer[index++] = nums[rp++];
      loop++;
    }
    return answer;
  }
}
