package com.example.server.model;

import io.swagger.annotations.ApiModel;

/**
 * Category.
 *
 * @author qct
 * @date 2017/10/27
 */
@ApiModel
public class Category {

    private int id;

    private String name;

    public Category(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
