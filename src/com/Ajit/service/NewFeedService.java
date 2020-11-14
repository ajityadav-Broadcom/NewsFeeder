package com.Ajit.service;

import com.Ajit.Modal.Post;
import com.Ajit.Modal.User;
import com.Ajit.exception.AlreadyPresentUserException;

import java.util.HashMap;
import java.util.Map;

public class NewFeedService {
    private Map<String, User> userMap;
    private Map<Long, Post> postMap;
    private Map<Long, Map<String, String>> postComment;
    private Map<Long, Long> upvoteMap;
    private Map<Long, Long> downVote;
    private User activeUser;

    public NewFeedService() {
        this.userMap = new HashMap<>();
        this.postComment = new HashMap<>();
        this.postMap = new HashMap<>();
        this.postComment = new HashMap<>();
        this.upvoteMap = new HashMap<>();
        this.downVote = new HashMap<>();
    }
    public void addUser(final User user){
        if(userMap.containsKey()){
            throw  new AlreadyPresentUserException("");
        }
    }
    public void LoginUser(final String userName){

    }
    public void removeUser(final String userNAme){

    }
    public  void followUser(final String userName){

    }
}
