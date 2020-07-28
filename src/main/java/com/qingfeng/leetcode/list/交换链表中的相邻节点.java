package com.qingfeng.leetcode.list;

import common.ListNode;

/**
 * @author shihangqi
 * @ClassName: 交换链表中的相邻节点
 * @Description:
 * @date 2020/7/22 3:09 下午
 */
public class 交换链表中的相邻节点 {

    //题目要求：不能修改结点的 val 值，O(1) 空间复杂度。

    public ListNode process (ListNode head){
        if (head == null || head.next ==null)return null;

        ListNode node = new ListNode();

        node.next = head;

        ListNode pre = node;

        while (pre.next!=null &&pre.next.next!=null){
            ListNode l1 = pre.next,l2 = pre.next.next;
            ListNode next = l2.next;
            l1.next=next;
            l2.next = l1;
            pre.next = l2;
            pre = l1;
        }

        return node.next;

    }

}
