package com.jikexueyuan.service;

import com.jikexueyuan.domain.Book;
import com.jikexueyuan.domain.Category;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by caochenghua on 2017/4/23.
 */


////////////// very important !!!
@Service
public class BookServiceImpl implements BookService {

    private List<Category> categories;
    private List<Book> books;

    public BookServiceImpl() {
        categories=new ArrayList<Category>();
        Category category=new Category(1,"Computing");
        Category category2=new Category(2,"Travel");
        Category category3=new Category(3,"Health");

        categories.add(category);
        categories.add(category2);
        categories.add(category3);

        books=new ArrayList<Book>();
        books.add(new Book(1L,"345345346456","Servlet & JSP",category,"CaoChenghua"));
        books.add(new Book(2L,"435346456566","C# & .NET",category2,"ChenZhuo"));
    }

    @Override
    public List<Category> getAllCategories() {
        return categories;
    }

    @Override
    public Book save(Book book) {
        book.setId(getNextId());
        books.add(book);
        return book;
    }

    @Override
    public Book get(long id) {
        for (Book book:books) {
            if (id==book.getId()) {
                return book;
            }
        }
        return null;
    }

    @Override
    public Category getCategory(int id) {
        for (Category category:categories) {
            if (id==category.getId()) {
                return category;
            }
        }
        return null;
    }

    @Override
    public Book update(Book book) {
        int bookCount=books.size();
        for (int i = 0; i < bookCount; i++) {
            Book savedBook=books.get(i);
            if (savedBook.getId() == book.getId()) {
                books.set(i,book);
                return book;
            }
        }
        return book;
    }

    @Override
    public List<Book> getAllBooks() {
        return books;
    }

    @Override
    public long getNextId() {
        long id=0L;
        for (Book book : books) {
            long bookId=book.getId();
            if (bookId>id) {
                id=bookId;
            }
        }
        return id+1;
    }
}
