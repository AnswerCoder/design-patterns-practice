/*
 * @(#) BookShelf.java
 *
 * Copyright ⓒ 2022 yunpeng.com
 */
package top.peng.iterator;


import java.util.ArrayList;
import java.util.List;

/**
 * BookShelf 书架的实体类
 *
 * @author yunpeng
 * @version 1.0 2022/8/7
 */
public class BookShelf implements Aggregate{
    private List<Book> books;

    public BookShelf(int initialsize) {
        this.books = new ArrayList<>(initialsize);
    }

    public Book getBookAt(int index){
        return books.get(index);
    }

    public void appendBook(Book book){
        books.add(book);
    }

    public int getLength(){
        return books.size();
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
