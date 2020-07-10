package com.qingfeng.leetcode.twopoint;

import java.util.Arrays;
import java.util.HashSet;

/**
 * @author shihangqi
 * @ClassName: ReverseVowelsString_345_e
 * @Description:
 * @date 2020/6/30 7:59 下午
 */
public class ReverseVowelsString_345_e {

    //使用双指针，一个指针从头向尾遍历，一个指针从尾到头遍历，当两个指针都遍历到元音字符时，交换这两个元音字符。
    //
    //为了快速判断一个字符是不是元音字符，我们将全部元音字符添加到集合 HashSet 中，从而以 O(1) 的时间复杂度进行该操作。
    private static HashSet<Character> vowels = new HashSet<>(
            Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')
    );


    public static String process(String s) {
        if (s == null) return null;
        int i = 0;
        int j = s.length() - 1;
        char[] result = new char[s.length()];
        while (i <= j) {
            char ci = s.charAt(i);
            char cj = s.charAt(j);
            if (!vowels.contains(ci)) {
                result[i++] = ci;
            } else if (!vowels.contains(cj)) {
                result[j--] = cj;
            } else {
                result[i++] = cj;
                result[j--] = ci;
            }
        }
        return new String(result);
    }

    public static void main(String[] args) {
        System.out.println(process("leetcode"));
    }

}
