package com.example.server.api;

import com.example.server.exception.DemoException;
import com.example.server.model.Category;
import com.example.server.service.CategoryService;
import io.swagger.annotations.ApiOperation;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Category API.
 *
 * @author qct
 * @date 2017/10/27
 */
@RestController
@RequestMapping("/v1/category")
public class CategoryApi {

    private final CategoryService categoryService;

    @Autowired
    public CategoryApi(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping("/")
    @ApiOperation(value = "获取全部分类")
    public List<Category> getAll() {
        return categoryService.getAll();
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "根据ID获取分类")
    public Category get(@PathVariable("id") Integer id) throws DemoException {
        return categoryService.get(id);
    }
}
