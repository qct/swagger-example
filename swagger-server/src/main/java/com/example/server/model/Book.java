package com.example.server.model;

import io.swagger.annotations.ApiModel;

/**
 * Book.
 *
 * @author qct
 * @date 2017/10/27
 */
@ApiModel
public class Book {

    private int id;

    private int categoryId;

    private String name;

    private String author;

    /**
     * Create Book with all parameters.
     * @param id id
     * @param categoryId categoryId
     * @param name name
     * @param author author
     */
    public Book(int id, int categoryId, String name, String author) {
        this.id = id;
        this.categoryId = categoryId;
        this.name = name;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
