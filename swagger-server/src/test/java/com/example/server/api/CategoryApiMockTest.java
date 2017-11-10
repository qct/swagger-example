package com.example.server.api;

import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.example.server.model.Category;
import com.example.server.service.CategoryService;
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
@WebMvcTest(CategoryApi.class)
public class CategoryApiMockTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private CategoryService categoryService;

    @Test
    public void getAllShouldReturnAllCategories() throws Exception {
        when(categoryService.getAll()).thenReturn(Lists.newArrayList(
            new Category(1, "技术"),
            new Category(2, "文学")
        ));
        mockMvc.perform(MockMvcRequestBuilders.get("/v1/category/").accept(MediaType.ALL))
            .andDo(print())
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
            .andExpect(jsonPath("$", hasSize(2)));
    }

    @Test
    public void getAllShouldReturnEmpty() throws Exception {
        when(categoryService.getAll()).thenReturn(Lists.newArrayList());
        mockMvc.perform(MockMvcRequestBuilders.get("/v1/category/").accept(MediaType.ALL))
            .andDo(print())
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
            .andExpect(jsonPath("$", hasSize(0)));
    }


    @Test
    public void getShouldReturnSpecifiedCategory() throws Exception {
        when(categoryService.get(1)).thenReturn(new Category(1, "技术"));
        mockMvc.perform(MockMvcRequestBuilders
            .get("/v1/category/1").accept(MediaType.ALL))
            .andDo(print())
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
            .andExpect(jsonPath("$.id", is(1)));
    }

    @Test
    public void getByInvalidIdShouldReturnDefault() throws Exception {
        when(categoryService.get(5)).thenReturn(new Category(-1, "NOT EXIST"));
        mockMvc.perform(MockMvcRequestBuilders
            .get("/v1/category/5").accept(MediaType.ALL))
            .andDo(print())
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
            .andExpect(jsonPath("$.id", is(-1)));
    }
}
