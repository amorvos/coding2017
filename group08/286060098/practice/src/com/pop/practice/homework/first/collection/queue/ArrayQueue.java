package com.pop.practice.homework.first.collection.queue;

import com.pop.practice.homework.first.collection.Collection;
import com.pop.practice.homework.first.collection.Iterator;

/**
 * @author haipop Date: 17-2-16 Time: 下午6:34
 */
public class ArrayQueue<T> implements Collection<T> {

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public T next() {
        return null;
    }

    @Override
    public void add(T element) throws IllegalAccessException {

    }

    @Override
    public void addAll(Collection<T> collection) throws IllegalAccessException {

    }

    @Override
    public void remove(T element) {

    }

    @Override
    public void removeAll(Collection<T> collection) {

    }

    @Override
    public int contain(T element) {
        return 0;
    }
}