package com.example.server.exception;

/**
 * default description.
 *
 * @author qct
 * @since 1.0
 */
public class BookNotFoundException extends DemoException {

    public BookNotFoundException() {
    }

    public BookNotFoundException(String message) {
        super(message);
    }
}
