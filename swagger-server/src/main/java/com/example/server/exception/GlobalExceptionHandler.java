package com.example.server.exception;

import com.example.server.model.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * default description.
 *
 * @author qct
 * @since 1.0
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(DemoException.class)
    public ResponseEntity<ErrorResponse> handleDemoException(DemoException exception) {
        return ResponseEntity.status(HttpStatus.OK).body(new ErrorResponse(exception.getMessage()));
    }
}
