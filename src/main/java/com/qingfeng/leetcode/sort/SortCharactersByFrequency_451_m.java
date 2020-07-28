package com.qingfeng.leetcode.sort;

import org.junit.Test;

import java.util.*;

/**
 * @author shihangqi
 * @ClassName: SortCharactersByFrequency_451_m
 * @Description:
 * @date 2020/7/20 10:53 下午
 */
public class SortCharactersByFrequency_451_m {

    //按照字符出现次数对字符串排序

    public String process(String s) {

        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        List<Character>[] lists = new List[s.length() + 1];
        for (Character c : map.keySet()) {
            int f = map.get(c);
            if (lists[f] == null) lists[f] = new ArrayList<>();
            lists[f].add(c);
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = lists.length - 1; i >= 0; i--) {
            if (lists[i] == null) continue;
            for (char c : lists[i]) {
                for (int j = 0; j < i; j++) {
                    stringBuilder.append(c);
                }
            }

        }
        return stringBuilder.toString();
    }
    @Test
    public void test(){
        System.out.println(process("tree"));
    }

}
