package com.learnings.leetcode.arrays;

import java.util.Arrays;

public class ArrayConcatenation {
  //https://leetcode.com/problems/concatenation-of-array/
  public static void main(String[] args) {
    ArrayConcatenation obj = new ArrayConcatenation();
    System.out.println(Arrays.toString(obj.getConcatenation(new int[] { 2, 5, 1, 3, 4, 7 })));

  }

  public int[] getConcatenation(int[] nums) {
    int[] answer = new int[nums.length * 2];
    for (int i = 0; i < nums.length; i++) {
      answer[i] = nums[i];
      answer[i + nums.length] = nums[i];
    }
    return answer;
  }

  

}

