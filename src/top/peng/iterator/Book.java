/*
 * @(#) Book.java
 *
 * Copyright ⓒ 2022 yunpeng.com
 */
package top.peng.iterator;

/**
 * Book 书的实体类
 *
 * @author yunpeng
 * @version 1.0 2022/8/7
 */
public class Book {
    private String name;

    public Book(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
