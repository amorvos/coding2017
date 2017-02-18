package com.pop.practice.homework.first.tree;

import java.util.List;

import com.google.common.collect.Lists;

/**
 * @author haipop Date: 17-2-18 Time: 下午2:35
 */
public class BTree<T> {

    /**
     * 树根
     */
    private BTreeNode root;

    /**
     * 分叉数
     */
    private int size;

    /**
     * 获取根节点
     */
    public BTreeNode getRoot() {
        return root;
    }

    /**
     * 构造函数
     */
    public BTree() {
        root = new BTreeNode(new TreeNode());
    }

    public BTree build(List<T> nodes) {
        BTree tree = new BTree();

        return tree;
    }

    public void addChild(T target, T child) {

    }

    private class BTreeNode<T> {
        /**
         * 树节点信息
         */
        private TreeNode<T> data;
        /**
         * 子节点集合
         */
        private List<BTreeNode> childList;

        BTreeNode(TreeNode data) {
            this.data = data;
            this.childList = Lists.newArrayList();
        }

        TreeNode getData() {
            return data;
        }

        void setData(TreeNode data) {
            this.data = data;
        }

        List<BTreeNode> getChildList() {
            return childList;
        }

        void setChildList(List<BTreeNode> childList) {
            this.childList = childList;
        }
    }
}