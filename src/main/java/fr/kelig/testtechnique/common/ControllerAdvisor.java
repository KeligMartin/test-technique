package fr.kelig.testtechnique.common;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice

public class ControllerAdvisor extends ResponseEntityExceptionHandler {

    @ExceptionHandler(TooOldException.class)
    protected ResponseEntity<?> handleTooOldException(TooOldException exception, WebRequest request) {
        return handleExceptionInternal(exception, exception.getErrors(), new HttpHeaders(), HttpStatus.BAD_REQUEST, request);
    }
}
