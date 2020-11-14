package com.Ajit.exception;

public class NoActiveUser extends RuntimeException {
    public NoActiveUser(String no_user_is_logIn) {
        super(no_user_is_logIn);
    }
}
