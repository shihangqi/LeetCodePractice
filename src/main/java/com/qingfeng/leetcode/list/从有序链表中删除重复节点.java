package com.qingfeng.leetcode.list;

import common.ListNode;

/**
 * @author shihangqi
 * @ClassName: 从有序链表中删除重复节点
 * @Description:
 * @date 2020/7/22 2:52 下午
 */
public class 从有序链表中删除重复节点 {

    public ListNode process(ListNode head) {
        if (head == null || head.next == null) return head;
        head.next = process(head.next);
        return head.data == head.next.data ? head.next : head;
    }
}
