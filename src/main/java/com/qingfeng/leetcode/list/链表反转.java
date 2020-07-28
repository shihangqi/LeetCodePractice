package com.qingfeng.leetcode.list;

import common.ListNode;

/**
 * @author shihangqi
 * @ClassName: 链表反转
 * @Description:
 * @date 2020/7/22 11:08 上午
 */
public class 链表反转 {

    public ListNode process(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode next = head.next;
        ListNode newHead = process(next);
        next.next = head;
        head.next = null;
        return newHead;
    }

    public ListNode process1(ListNode head) {
        if (head == null) return null;
        ListNode newHead = new ListNode();
        while (head!=null){
            ListNode next = head.next;
            head.next = newHead.next;
            newHead.next = head;
            head = next;
        }
        return newHead.next;
    }


}
