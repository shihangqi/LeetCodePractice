package com.qingfeng.leetcode.twopoint;

import common.ListNode;

/**
 * @author shihangqi
 * @ClassName: LinkedListCycle_141_e
 * @Description:
 * @date 2020/7/10 7:33 下午
 */
public class LinkedListCycle_141_e {

    //使用双指针，一个指针每次移动一个节点，一个指针每次移动两个节点，如果存在环，那么这两个指针一定会相遇。


    public boolean process(ListNode head) {
        if (head == null) {
            return false;
        }
        ListNode l1 = head;
        ListNode l2 = head.next;
        while (l1 != null && l2 != null && l2.next != null) {
            if (l1 == l2){
                return true;
            }
            l1 = l1.next;
            l2 = l2.next.next;
        }
        return false;

    }
}
