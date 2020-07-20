package com.qingfeng.leetcode.sort;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author shihangqi
 * @ClassName: TopKFrequentElements_347_m
 * @Description:
 * @date 2020/7/19 7:15 下午
 */
public class TopKFrequentElements_347_m {

    //出现频率最多的 k 个元素
    //设置若干个桶，每个桶存储出现频率相同的数。桶的下标表示数出现的频率，即第 i 个桶中存储的数出现的频率为 i。
    //
    //把数都放到桶之后，从后向前遍历桶，最先得到的 k 个数就是出现频率最多的的 k 个数。

    public List<Integer> process(int[] nums, int k) {
        List<Integer> res = new ArrayList();
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer>[] lists = new List[nums.length + 1];
        for (Integer integer : map.keySet()) {
            int i = map.get(integer);
            if (lists[i] == null) lists[i] = new ArrayList<>();
            lists[i].add(integer);
        }
        for (int i = nums.length-1;i>=0&&res.size()<k;i--){
            if(lists[i] == null) continue;
            res.addAll(lists[i]);
        }
        return res;
    }

}
