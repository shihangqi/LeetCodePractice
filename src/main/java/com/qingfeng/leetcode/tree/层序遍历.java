package com.qingfeng.leetcode.tree;

import common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author shihangqi
 * @ClassName: 层序遍历
 * @Description:
 * @date 2020/7/22 3:35 下午
 */
public class 层序遍历 {


    //一棵树每层节点的平均数

    public List<Double> process(TreeNode root) {
        List<Double> ret = new ArrayList<>();
        if (root == null) return ret;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (queue != null) {
            int cnt = queue.size();
            double sum = 0;
            for (int i = 0; i < cnt; i++) {
                TreeNode node = queue.poll();
                sum += node.data;
                if (node.leftChild != null) queue.offer(node.leftChild);
                if (node.rightChild != null) queue.offer(node.rightChild);
            }
            ret.add(sum / cnt);
        }
        return ret;
    }


    //得到左下角的节点
    public int process1(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            root = queue.poll();
            if (root.rightChild!=null) queue.offer(root.rightChild);
            if (root.leftChild!=null) queue.offer(root.leftChild);
        }
        return root.data;
    }



}
