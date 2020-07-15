package com.qingfeng.leetcode.sort;

import org.junit.Test;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.stream.Stream;

/**
 * @author shihangqi
 * @ClassName: KthLargestInArray_215_m
 * @Description:
 * @date 2020/7/14 10:35 下午
 */
public class KthLargestInArray_215_m {

    //题目描述：找到倒数第 k 个的元素。

    @Test
    public void test() {
        System.out.println(process2(new int[]{3, 8, 1, 3, 4, 5}, 1));
    }

    //排序 ：时间复杂度 O(NlogN)，空间复杂度 O(1)
    public int process1(int[] num, int k) {
        Arrays.sort(num);
        return num[num.length - k];

    }

    //堆 ：时间复杂度 O(NlogK)，空间复杂度 O(K)。
    public int process2(int[] nums, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();//默认是个小顶堆
        PriorityQueue<Integer> heap1 = new PriorityQueue<>((num1,num2)->{return num2-num1;});//大顶堆
        for (int num : nums) {
            heap.add(num);
            if (heap.size() > k) {
                heap.poll();
            }
        }
        return heap.peek();
    }

    //快速选择 ：时间复杂度 O(N)，空间复杂度 O(1)  //快速排序算法
    public int process3(int[] nums, int k) {
        int n = nums.length - k;
        int l = 0, h = nums.length - 1;
        while (l < h) {
            int j = partition(nums, l, h);
            if (j == k) {
                break;
            } else if (j < k) {
                l = j + 1;
            } else {
                h = j - 1;
            }
        }
        return nums[k];
    }


    private int partition(int[] nums, int l, int h) {
        int pivot = nums[l];
        while (l < h) {
            while (l < h && nums[l] >= pivot) h--;
            nums[l] = nums[h];
            while (l < h && nums[l] <= pivot) l++;
            nums[h] = nums[l];
        }
        nums[l] = pivot;
        return l;
    }

}
