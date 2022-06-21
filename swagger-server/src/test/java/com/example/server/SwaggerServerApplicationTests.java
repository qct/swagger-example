package com.example.server;

import com.example.server.api.BookApi;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class SwaggerServerApplicationTests {

    @Autowired
    private BookApi bookApi;

    @Test
    public void contextLoads() throws Exception {
        Assertions.assertThat(bookApi).isNotNull();
    }
}
