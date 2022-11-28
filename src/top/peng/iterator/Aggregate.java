/*
 * @(#) Aggregate.java
 *
 * Copyright ⓒ 2022 yunpeng.com
 */
package top.peng.iterator;

/**
 * Aggregate 所要遍历的集合的接口
 * 实现了该接口的类将成为一个可以保存多个元素的集合
 *
 * @author yunpeng
 * @version 1.0 2022/8/7
 */
public interface Aggregate {
    /**
     * 生成一个用于遍历集合的迭代器
     * @return 迭代器
     */
    Iterator iterator();
}
