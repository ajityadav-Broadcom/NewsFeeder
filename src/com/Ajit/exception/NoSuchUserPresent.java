package com.Ajit.exception;

public class NoSuchUserPresent extends RuntimeException {
    public NoSuchUserPresent(String s) {
        super(s);
    }
}
