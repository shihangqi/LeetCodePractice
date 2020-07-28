package com.qingfeng.leetcode.sort;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author shihangqi
 * @ClassName: 荷兰国旗问题
 * @Description:
 * @date 2020/7/21 12:54 下午
 */
public class 荷兰国旗问题 {

    //荷兰国旗包含三种颜色：红、白、蓝。
    //
    //有三种颜色的球，算法的目标是将这三种球按颜色顺序正确地排列。它其实是三向切分快速排序的一种变种，
    //在三向切分快速排序中，每次切分都将数组分成三个区间：小于切分元素、等于切分元素、大于切分元素，而该算法是将数组分成三个区间：等于红色、等于白色、等于蓝色。
    //输入只有0，1，2 三个数
    //输入010221  输入001122

    public int[] process(int[] nums){
        int zero = -1,one=0,two = nums.length;
        while (one<two){
            if (nums[one] == 0){
                swap(nums,++zero,one++);
            }else if (nums[one] ==2){
                swap(nums,--two,one);
            }else {
                one++;
            }
        }
        return nums;

    }

    public void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
    @Test
    public void test(){
        System.out.println(Arrays.toString(process(new int[]{2,0,1})));
    }


}
