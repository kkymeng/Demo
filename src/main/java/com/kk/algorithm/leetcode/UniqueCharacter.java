package com.kk.algorithm.leetcode;

import java.util.HashMap;
import java.util.Map;

/***
 * 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1
 */
public class UniqueCharacter {
    public static void main(String[] args) {
        UniqueCharacter uniqueCharacter = new UniqueCharacter();
        String s = new String("helloheWord");
        int count = uniqueCharacter.firstUniqChar(s);
        System.out.println(count);
    }

    public int firstUniqChar(String s) {
        Map<Character,Integer> count = new HashMap<>();
        for(int i=0;i<s.length();i++){
            count.put(s.charAt(i),count.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i=0;i<s.length();i++){
            if (count.get(s.charAt(i))==1) {
                return i;
            }
        }
        return -1;

    }
}
