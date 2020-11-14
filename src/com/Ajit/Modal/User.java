package com.Ajit.Modal;

public class User {
    private String userName;
    private String email;

    public User(final String userName, final String email) {
        this.email = email;
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}


