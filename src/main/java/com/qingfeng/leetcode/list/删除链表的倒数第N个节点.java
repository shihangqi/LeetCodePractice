package com.qingfeng.leetcode.list;

import common.ListNode;

import java.util.List;

/**
 * @author shihangqi
 * @ClassName: 删除链表的倒数第N个节点
 * @Description:
 * @date 2020/7/22 2:56 下午
 */
public class 删除链表的倒数第N个节点 {

    public ListNode process(ListNode head, int n) {

        ListNode fast = head;
        while (n-- > 0) {
            fast = fast.next;
        }
        if (fast == null) return head.next;

        ListNode slow = head;
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        //删除的操作
        slow.next = slow.next.next;
        return head;

    }

}
