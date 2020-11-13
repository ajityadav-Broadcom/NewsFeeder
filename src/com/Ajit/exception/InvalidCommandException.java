package com.Ajit.exception;

public class InvalidCommandException extends RuntimeException {
    public InvalidCommandException(String s) {
        super(s);
    }
}
