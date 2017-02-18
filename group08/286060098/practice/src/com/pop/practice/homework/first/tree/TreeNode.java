package com.pop.practice.homework.first.tree;

/**
 * @author haipop Date: 17-2-18 Time: 下午2:33
 */
class TreeNode<T> {

    /**
     * 节点数据信息
     */
    private T data;
    /**
     * 父节点
     */
    private TreeNode parent;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public TreeNode getParent() {
        return parent;
    }

    public void setParent(TreeNode parent) {
        this.parent = parent;
    }
}