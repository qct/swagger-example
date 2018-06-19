package com.example.server.exception;

/**
 * default description.
 *
 * @author qct
 * @since 1.0
 */
public class CategoryNotFoundException extends DemoException {

    public CategoryNotFoundException() {
    }

    public CategoryNotFoundException(String message) {
        super(message);
    }
}
