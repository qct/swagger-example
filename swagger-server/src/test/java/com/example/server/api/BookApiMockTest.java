package com.example.server.api;

import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.isOneOf;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.example.server.model.Book;
import com.example.server.service.BookService;
import com.google.common.collect.Lists;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

/**
 * <p>Created by qct on 2017/10/20.
 */
@RunWith(SpringRunner.class)
@WebMvcTest(BookApi.class)
public class BookApiMockTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private BookService bookService;

    @Test
    public void getShouldReturnSpecifiedBook() throws Exception {
        when(bookService.getById(1)).thenReturn(new Book(1, 1, "Clean Code", "Martin"));
        mockMvc.perform(MockMvcRequestBuilders.get("/v1/book/1").accept(MediaType.ALL))
            .andDo(print())
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
            .andExpect(jsonPath("$.id", is(1)));
    }

    @Test
    public void getByInvalidIdShouldReturnDefault() throws Exception {
        when(bookService.getById(5)).thenReturn(new Book(-1, -1, "NOT EXIST", "NO AUTHOR"));
        mockMvc.perform(MockMvcRequestBuilders.get("/v1/book/5").accept(MediaType.ALL))
            .andDo(print())
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
            .andExpect(jsonPath("$.id", is(-1)));
    }

    @Test
    public void getByCategoryIdShouldReturnBooksOfThisCategory() throws Exception {
        when(bookService.getByCategoryId(1)).thenReturn(Lists.newArrayList(
            new Book(1, 1, "Clean Code", "Martin"),
            new Book(2, 1, "Effective Java", "Joshua Bloch"),
            new Book(3, 2, "挪威的森林", "村上春树")
        ));
        mockMvc.perform(MockMvcRequestBuilders
            .get("/v1/book/getByCategoryId").param("id", "1").accept(MediaType.ALL))
            .andDo(print())
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
            .andExpect(jsonPath("$", hasSize(3)));
    }

    @Test
    public void getByInvalidCategoryIdShouldReturnEmpty() throws Exception {
        when(bookService.getByCategoryId(1)).thenReturn(Lists.newArrayList(
            new Book(1, 1, "Clean Code", "Martin"),
            new Book(2, 1, "Effective Java", "Joshua Bloch"),
            new Book(3, 2, "挪威的森林", "村上春树")
        ));
        mockMvc.perform(MockMvcRequestBuilders
            .get("/v1/book/getByCategoryId").param("id", "2").accept(MediaType.ALL))
            .andDo(print())
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
            .andExpect(jsonPath("$", hasSize(0)));
    }

    @Test
    public void updateShouldReturnBoolean() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders
            .post("/v1/book/update").param("id", "1").accept(MediaType.ALL))
            .andDo(print())
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
            .andExpect(content().string(isOneOf("true", "false")));
    }
}
