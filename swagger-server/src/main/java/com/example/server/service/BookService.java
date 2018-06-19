package com.example.server.service;

import com.example.server.exception.BookNotFoundException;
import com.example.server.exception.DemoException;
import com.example.server.model.Book;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;

/**
 * Book service.
 *
 * @author qct
 * @date 2017/10/27
 */
@Service
public class BookService {

    private static final List<Book> BOOKS = Lists.newArrayList(
        new Book(1, 1, "Clean Code", "Martin"),
        new Book(2, 1, "Effective Java", "Joshua Bloch"),
        new Book(3, 2, "挪威的森林", "村上春树")
    );

    /**
     * Get Book by id.
     * @param id id
     * @return Book
     * @throws DemoException book not found exception
     */
    public Book getById(int id) throws DemoException {
        return BOOKS.stream()
            .filter(b -> id == b.getId())
            .findFirst()
            .orElseThrow((Supplier<DemoException>) () -> new BookNotFoundException("book not found"));
    }

    public List<Book> getByCategoryId(Integer categoryId) {
        return BOOKS.stream().filter(b -> categoryId == b.getCategoryId()).collect(Collectors.toList());
    }
}
