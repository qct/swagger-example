package com.example.server.service;

import com.example.server.exception.CategoryNotFoundException;
import com.example.server.exception.DemoException;
import com.example.server.model.Category;
import com.google.common.collect.Lists;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 * Category service.
 *
 * @author qct
 * @date 2017/10/27
 */
@Service
public class CategoryService {

    private static final List<Category> CATEGORIES = Lists.newArrayList(
        new Category(1, "技术"),
        new Category(2, "文学")
    );

    public List<Category> getAll() {
        return CATEGORIES;
    }

    /**
     * Get Category by id.
     * @param id id
     * @return Category
     * @throws DemoException category not found exception
     */
    public Category get(Integer id) throws DemoException {
        return CATEGORIES.stream()
            .filter(c -> id == c.getId())
            .findAny()
            .orElseThrow(() -> new CategoryNotFoundException("category not found"));
    }
}
