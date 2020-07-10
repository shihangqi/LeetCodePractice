package com.qingfeng.leetcode.twopoint;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author shihangqi
 * @ClassName: MergeSortedArray_88_e
 * @Description:
 * @date 2020/7/10 3:48 下午
 */
public class MergeSortedArray_88_e {

    //题目描述：把归并结果存到第一个数组上。
    //
    //需要从尾开始遍历，否则在 nums1 上归并得到的值会覆盖还未进行归并比较的值。


    public int[] process(int[] nums1, int m, int[] nums2, int n) {
        if (nums1 == null || nums2 == null) {
            return null;
        }
        int index1 = m - 1;
        int index2 = n - 1;
        int indexmerge = m + n - 1;
        while (index1 >= 0 || index2 >= 0) {
            if (index1 < 0) {
                nums1[indexmerge--] = nums2[index2--];
            } else if (index2 < 0) {
                nums1[indexmerge--] = nums1[index1--];
            } else if (nums1[index1] > nums2[index2]) {
                nums1[indexmerge--] = nums1[index1--];
            } else {
                nums1[indexmerge--] = nums2[index2--];
            }
        }
        return nums1;
    }

    @Test
    public void test() {
        System.out.println(Arrays.toString(process(new int[]{1, 2, 3, 0, 0, 0}, 3, new int[]{2, 4, 5}, 3)));
    }
}
