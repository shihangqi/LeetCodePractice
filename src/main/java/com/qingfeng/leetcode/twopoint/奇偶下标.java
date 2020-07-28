package com.qingfeng.leetcode.twopoint;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author shihangqi
 * @ClassName: 奇偶下标
 * @Description:
 * @date 2020/7/21 10:37 上午
 */
public class 奇偶下标 {

    //数组A，2*n个元素，n个奇数、n个偶数，设计一个算法，使得数组奇数下标位置放置的都是奇数，偶数下标位置放置的都是偶数

    public int[] process(int[] nums) {
        int o = 0, j = 1;
        while (true) {
            while (o < nums.length) {
                if ((nums[o] & 1) == 1) break;
                o += 2;
            }
            while (j < nums.length) {
                if ((nums[j] & 1) == 0) break;
                j += 2;
            }
            if (o>=nums.length || j>=nums.length) break;
            swap(nums, o, j);
        }
        return nums;

    }

    public void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    @Test
    public void test() {
        System.out.println(Arrays.toString(process(new int[]{1, 2, 3, 4, 5, 6})));
    }

}
