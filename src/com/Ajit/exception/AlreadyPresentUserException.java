package com.Ajit.exception;

public class AlreadyPresentUserException extends RuntimeException {
    public AlreadyPresentUserException(String s) {
        super(s);
    }
}
