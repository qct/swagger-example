package com.example.server.service;

import com.example.server.model.Category;
import com.google.common.collect.Lists;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 * <p>Created by Damon.Q on 2017/10/27.
 */
@Service
public class CategoryService {

    private static final List<Category> CATEGORIES = Lists.newArrayList(
        new Category(1, "技术"),
        new Category(2, "文学")
    );

    private static final Category NOT_EXIST = new Category(-1, "NOT EXIST");

    public List<Category> getAll() {
        return CATEGORIES;
    }

    public Category get(Integer id) {
        return CATEGORIES.stream().filter(c -> id == c.getId()).findAny().orElse(NOT_EXIST);
    }
}
