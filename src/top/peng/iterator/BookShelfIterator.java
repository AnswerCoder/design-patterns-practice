/*
 * @(#) BookShelfIterator.java
 *
 * Copyright ⓒ 2022 yunpeng.com
 */
package top.peng.iterator;

/**
 * BookShelfIterator 用于遍历书架的迭代器
 *
 * @author yunpeng
 * @version 1.0 2022/8/7
 */
public class BookShelfIterator implements Iterator{
    private BookShelf bookShelf;
    private int index;

    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < bookShelf.getLength();
    }

    @Override
    public Object next() {
        Book book = bookShelf.getBookAt(index);
        index++;
        return book;
    }
}
