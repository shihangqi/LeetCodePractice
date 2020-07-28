package com.qingfeng.leetcode.list;

import common.ListNode;

/**
 * @author shihangqi
 * @ClassName: 找出两个链表交点
 * @Description:
 * @date 2020/7/21 6:51 下午
 */
public class 找出两个链表交点 {


    //例如以下示例中 A 和 B 两个链表相交于 c1：

    public ListNode process(ListNode headA, ListNode headB) {
        ListNode l1 = headA, l2 = headB;
        while (l1 != l2) {
            l1 = (l1 == null) ? headB : l1.next;
            l2 = (l2 == null) ? headA : l2.next;
        }
        return l1;
    }

}
