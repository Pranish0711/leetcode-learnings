package com.learnings.leetcode.arrays;

public class MostWordsFound {

  public static void main(String[] args) {
    String[] ans= null;
    MostWordsFound obj = new MostWordsFound();
    obj.mostWordsFound(new String[]{"alice and bob love leetcode", "i think so too", "this is great thanks very much"});
    System.out.println();
  }
  public int mostWordsFound(String[] sentences) {
    int max = 0;
    for (int i = 0; i < sentences.length; i++) {
      max = Math.max(sentences[i].split(" ").length, max);
    }
    return max;
  }
}
