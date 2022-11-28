/*
 * @(#) Main.java
 *
 * Copyright ⓒ 2022 yunpeng.com
 */
package top.peng.iterator;

/**
 * Main
 *
 * @author yunpeng
 * @version 1.0 2022/8/7
 */
public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("三国演义"));
        bookShelf.appendBook(new Book("水浒传"));
        bookShelf.appendBook(new Book("西游记"));
        bookShelf.appendBook(new Book("红楼梦"));
        bookShelf.appendBook(new Book("兄弟"));
        bookShelf.appendBook(new Book("许三观卖血记"));
        Iterator it = bookShelf.iterator();
        while (it.hasNext()){
            Book book = (Book) it.next();
            System.out.println(book.getName());
        }
    }
}
