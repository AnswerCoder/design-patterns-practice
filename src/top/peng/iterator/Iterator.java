/*
 * @(#) Iterator.java
 *
 * Copyright ⓒ 2022 yunpeng.com
 */
package top.peng.iterator;

/**
 * Iterator 用于遍历集合中的元素
 *
 * @author yunpeng
 * @version 1.0 2022/8/7
 */
public interface Iterator {
    /**
     * 是否存在下一个元素
     * @return ture or false
     */
    boolean hasNext();

    /**
     * 返回集合中的一个元素，并将迭代器位置移动至下一个元素的位置
     * @return object
     */
    Object next();
}
