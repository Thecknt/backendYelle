package com.envios.yelle.Exceptions;

import org.springframework.http.HttpStatus;

public class ApplicationException extends RuntimeException{

    private static final long serialVersionUID = 1L;

    private HttpStatus status;

    public ApplicationException(String message, HttpStatus status) {
        super(message);
        this.status = status;
    }

    public HttpStatus getStatus() {
        return status;
    }
}
