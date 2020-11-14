package com.Ajit.exception;

public class NoSuchPostPresent extends RuntimeException {
    public NoSuchPostPresent(String s) {
        super(s);
    }
}
