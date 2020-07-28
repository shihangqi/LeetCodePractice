package com.qingfeng.leetcode.tree;

import common.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @author shihangqi
 * @ClassName: 前中后序遍历
 * @Description:
 * @date 2020/7/22 4:06 下午
 */
public class 前中后序遍历 {

    public List<Integer> process(TreeNode root){
        //非递归前序遍历

        List<Integer> ret = new ArrayList<>();

        LinkedList<TreeNode> stack = new LinkedList<>();

        stack.push(root);

        while (!stack.isEmpty()){
            TreeNode node = stack.pop();
            if (node==null)continue;
            ret.add(node.data);
            stack.push(node.rightChild);
            stack.push(node.leftChild);
        }
        return ret;
    }
    public List<Integer> process1(TreeNode root){
        //非递归后序遍历
        //前序遍历为 root -> left -> right，后序遍历为 left -> right -> root。可以修改前序遍历成为 root -> right -> left，那么这个顺序就和后序遍历正好相反。
        List<Integer> list = new ArrayList<>();

        LinkedList<TreeNode> stack = new LinkedList<>();

        stack.push(root);
        while (!stack.isEmpty()){
            TreeNode node = stack.pop();
            if (node ==null)continue;
            list.add(node.data);
            stack.push(node.leftChild);
            stack.push(node.rightChild);

        }
        Collections.reverse(list);
        return list;

    }

    public List<Integer> process2(TreeNode root){

        List<Integer> list = new ArrayList<>();

        if(root ==null) return list;

        LinkedList<TreeNode> stack = new LinkedList<>();

        TreeNode cur = root;
        while (cur!=null || !stack.isEmpty()){
            while (cur!=null){
                stack.push(cur);
                cur = cur.leftChild;
            }
            TreeNode node = stack.pop();
            list.add(node.data);
            cur = node.rightChild;

        }
        return list;

    }



}
