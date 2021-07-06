package com.example.application;

public class BookIdMisMatchException extends RuntimeException {
    public BookIdMisMatchException(){
        super();
    }
    public BookIdMisMatchException (String message, Throwable cause){
        super(message, cause);
    }
}
