package com.qingfeng.leetcode.list;

import common.ListNode;
import org.junit.Test;

import java.util.*;

/**
 * @author shihangqi
 * @ClassName: 归并两个有序的链表
 * @Description:
 * @date 2020/7/22 11:35 上午
 */
public class 归并两个有序的链表 {
//
//    class TreeNode {
//        public int data;
//        public TreeNode leftChild;
//        public TreeNode rigthChild;
//    }


    public ListNode process(ListNode head1, ListNode head2) {
        if (head1 == null) return head2;
        if (head2 == null) return head1;
        if (head1.data < head2.data) {
            head1.next = process(head1.next, head2);
            return head1;
        } else {
            head2.next = process(head1, head2.next);
            return head2;
        }
    }

    @Test
    public void test(){
        ListNode[] listNodes = new ListNode[10];
        Random random = new Random();
        //生成随机数的递增ListNode[]
        for (int i = 0; i < listNodes.length; i++) {
            ListNode head = new ListNode();
            ListNode current = head;
            for (int j = 0; j < random.nextInt(15) + 1; j++) {
                ListNode node = new ListNode();
                node.data = (j + 1) * (i + 1);
                node.next = null;
                current.next = node;
                current = current.next;
                System.out.print(node.data + " ");
            }
            listNodes[i] = head.next;
            System.out.println();
        }

        System.out.println("========================");
        ListNode listNode = process(listNodes);
        while (listNode != null) {
            System.out.print(listNode.data + " ");
            listNode = listNode.next;
        }
    }




    //归并多个有序链表。
    public ListNode process(ListNode[] listNodes) {

        if (listNodes == null || listNodes.length == 0) return null;

        ListNode newList = new ListNode();

        ListNode current = newList;
        Queue<ListNode> queue = new PriorityQueue<>(Comparator.comparingInt(a -> a.data));
        for (ListNode node : listNodes) {
            if (node!=null){
                queue.offer(node);
            }
        }
        while (!queue.isEmpty()){
            ListNode temp = queue.poll();
            current.next = temp;
            if (temp.next!=null){
                queue.offer(temp.next);
            }
            current = current.next;
        }
        return newList;

    }


}
