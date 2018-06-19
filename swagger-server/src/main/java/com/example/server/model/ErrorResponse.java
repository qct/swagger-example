package com.example.server.model;

/**
 * Describe error.
 *
 * @author qct
 * @since 1.0
 */
public class ErrorResponse {

    public ErrorResponse() {
    }

    public ErrorResponse(String message) {
        this.message = message;
    }

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
