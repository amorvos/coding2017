package com.pop.practice.homework.first.tree;

/**
 * @author haipop Date: 17-2-19 Time: 下午5:12
 */
public interface Tree<T> {

    /**
     * 添加节点
     */
    boolean addChild(T target, T child) throws IllegalAccessException;

    /**
     * 节点查找
     */
    boolean contain(T data) throws IllegalAccessException;

}