package com.Ajit.Modal;

import java.time.LocalDateTime;

public class Post extends Audit {
    private String postDescription;
    private LocalDateTime createdTime;
    private LocalDateTime updatedTime;

    public Post(String message) {
        super();
        this.postDescription = message;
        this.createdTime = LocalDateTime.now();
        this.updatedTime = LocalDateTime.now();
    }

    public String getPostDescription() {
        return postDescription;
    }

    public LocalDateTime getCreatedTime() {
        return createdTime;
    }

    public LocalDateTime getUpdatedTime() {
        return updatedTime;
    }

    public void updateMessage(final String message) {
        postDescription = message;
        updatedTime = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "Post{" +
                "postDescription='" + postDescription + '\'' +
                ", createdTime=" + createdTime +
                ", updatedTime=" + updatedTime +
                '}';
    }
}
