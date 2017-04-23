package com.jikexueyuan.domain;

import java.io.Serializable;

/**
 * Created by caochenghua on 2017/4/23.
 */
public class Book implements Serializable {
    private static final long serialVersionUID=234235346456547L;
    private long id;
    private String isbn;
    private String title;
    private Category category;

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    private String author;

    public Book() {
    }

    public Book(long id, String isbn, String title, Category category, String author) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.category = category;
        this.author = author;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category=category;
    }

    public void setId(long nextId) {
        this.id=nextId;
    }

    public long getId() {
        return id;
    }
}
