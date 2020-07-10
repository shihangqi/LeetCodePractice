package com.qingfeng.leetcode.twopoint;

/**
 * @author shihangqi
 * @ClassName: ValidPalindromeII_680_e
 * @Description:
 * @date 2020/7/10 3:09 下午
 */
public class ValidPalindromeII_680_e {

    //题目描述：可以删除一个字符，判断是否能构成回文字符串。
    //
    //所谓的回文字符串，是指具有左右对称特点的字符串，例如 "abcba" 就是一个回文字符串。
    //
    //使用双指针可以很容易判断一个字符串是否是回文字符串：令一个指针从左到右遍历，一个指针从右到左遍历，这两个指针同时移动一个位置，每次都判断两个指针指向的字符是否相同，如果都相同，字符串才是具有左右对称性质的回文字符串。


    public static boolean process(String s) {
        if (s == null) return false;
        int i = 0;
        int j = s.length() - 1;
        int count = 0;
        while (i < j) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            } else if (count > 0) {
                return false;
            } else {
                count++;
                if (s.charAt(i + 1) == s.charAt(j)) {
                    System.out.println("You could delete the character '"+s.charAt(i)+"'");
                    i++;
                } else if (s.charAt(i) == s.charAt(j--)) {
                    System.out.println("You could delete the character '"+s.charAt(j)+"'");
                    j--;
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(process("cabdcbac"));
    }
}
