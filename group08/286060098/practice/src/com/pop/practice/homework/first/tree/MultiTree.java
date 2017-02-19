package com.pop.practice.homework.first.tree;

import java.util.Objects;

import com.pop.practice.homework.first.collection.list.ArrayList;
import com.pop.practice.homework.first.collection.list.List;
import com.pop.practice.homework.first.collection.queue.LinkQueue;
import com.pop.practice.homework.first.collection.queue.Queue;

/**
 * @author haipop Date: 17-2-18 Time: 下午2:35
 */
public class MultiTree<T> implements Tree<T> {

    /**
     * 树根
     */
    private MultiTreeNode root;

    /**
     * 分叉数
     */
    private int size;

    public MultiTree(T data) {
        root = new MultiTreeNode(data);
        this.size = Integer.MAX_VALUE;
    }

    public MultiTree(T data, int size) {
        root = new MultiTreeNode(data);
        this.size = size;
    }

    public boolean addChild(T target, T child) throws IllegalAccessException {
        Queue<MultiTreeNode> queue = new LinkQueue<MultiTreeNode>();
        queue.push(root);
        while (queue.isEmpty()) {
            MultiTreeNode node = queue.pull();
            if (Objects.equals(node.getData(), target)) {
                MultiTreeNode childNode = new MultiTreeNode(child);
                node.addChild(childNode);
                return true;
            } else {
                queue.addAll(node.getChildList());
            }
        }
        return false;
    }

    public boolean contain(T data) throws IllegalAccessException {
        Queue<MultiTreeNode> queue = new LinkQueue<MultiTreeNode>();
        queue.push(root);
        while (queue.isEmpty()) {
            MultiTreeNode node = queue.pull();
            if (Objects.equals(node.getData(), data)) {
                return true;
            } else {
                queue.addAll(node.getChildList());
            }
        }
        return false;
    }

    private class MultiTreeNode {
        /**
         * 树节点信息
         */
        private TreeNode<T> data;
        /**
         * 子节点集合
         */
        private List<MultiTreeNode> childList;

        MultiTreeNode(T data) {
            this.data = new TreeNode<T>(data);

        }

        MultiTreeNode(TreeNode<T> node) {
            this.data = node;
            if (size < Integer.MAX_VALUE) {
                this.childList = new ArrayList(size);
            } else {
                this.childList = new ArrayList();
            }
        }

        TreeNode<T> getData() {
            return data;
        }

        void setData(TreeNode<T> data) {
            this.data = data;
        }

        List<MultiTreeNode> getChildList() {
            return childList;
        }

        void setChildList(List<MultiTreeNode> childList) {
            this.childList = childList;
        }

        void addChild(MultiTreeNode node) throws IllegalAccessException {
            this.childList.add(node);
        }
    }
}