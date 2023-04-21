package com.learnings.leetcode.arrays;
//https://leetcode.com/problems/final-value-of-variable-after-performing-operations/description/
public class FinalValueOfVariableAfterPerformingOperations {
  
  
  public static void main(String[] args) {
    FinalValueOfVariableAfterPerformingOperations obj= new FinalValueOfVariableAfterPerformingOperations();
    int ans = obj.finalValueAfterOperations(new String[]{"X++","X--","--X","++X"});
    System.out.println(ans);
  }
  public int finalValueAfterOperations(String[] operations) {
    int ans = 0;
    for (int i = 0; i < operations.length; i++) {
      if (operations[i].equals("X++") || operations[i].equals("++X")) {
        ans++;
      } else {
        ans--;
      }
    }
    return ans;
  }
}
