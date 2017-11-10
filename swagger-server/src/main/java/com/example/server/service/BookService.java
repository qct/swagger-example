package com.example.server.service;

import com.example.server.model.Book;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;

/**
 * <p>Created by Damon.Q on 2017/10/27.
 */
@Service
public class BookService {

    private static final List<Book> BOOKS = Lists.newArrayList(
        new Book(1, 1, "Clean Code", "Martin"),
        new Book(2, 1, "Effective Java", "Joshua Bloch"),
        new Book(3, 2, "挪威的森林", "村上春树")
    );
    private static final Book NOT_EXIST = new Book(-1, -1, "NOT EXIST", "NO AUTHOR");

    public Book getById(int id) {
        return BOOKS.stream().filter(b -> id == b.getId()).findAny().orElse(NOT_EXIST);
    }

    public List<Book> getByCategoryId(Integer categoryId) {
        return BOOKS.stream().filter(b -> categoryId == b.getCategoryId()).collect(Collectors.toList());
    }
}
