package com.jikexueyuan.service;

import com.jikexueyuan.domain.Book;
import com.jikexueyuan.domain.Category;
//import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by caochenghua on 2017/4/23.
 */

//@Repository
public interface BookService {
    List<Category> getAllCategories();
    Book save(Book book);

    Book get(long id);

    Category getCategory(int id);

    Book update(Book book);

    List<Book> getAllBooks();
    long getNextId();
}
