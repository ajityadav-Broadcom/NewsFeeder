package com.Ajit.service;

import com.Ajit.Modal.Post;
import com.Ajit.Modal.User;
import com.Ajit.exception.AlreadyPresentUserException;
import com.Ajit.exception.NoActiveUser;
import com.Ajit.exception.NoSuchUserPresent;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NewFeedService {
    private final Map<String, User> userMap;
    private final Map<Long, Post> postMap;
    private final Map<String, List<Long>> userPost;
    private final Map<Long, Map<String, String>> postComment;
    private final Map<String, List<String>> followerMap;
    private final Map<Long, Long> upvoteMap;
    private final Map<Long, Long> downVote;
    private User activeUser;

    public NewFeedService() {
        this.userMap = new HashMap<>();
        this.postComment = new HashMap<>();
        this.postMap = new HashMap<>();
        this.upvoteMap = new HashMap<>();
        this.downVote = new HashMap<>();
        this.userPost = new HashMap<>();
        this.followerMap = new HashMap<>();
    }

    public void addUser(final User user) {
        if (userMap.containsKey(user.getUserName())) {
            throw new AlreadyPresentUserException("");
        }
        userMap.put(user.getUserName(), user);
    }

    public void LoginUser(final String userName) {
        if (!userMap.containsKey(userName)) {
            throw new NoSuchUserPresent(userName + " Invalid User");
        }
        activeUser = userMap.get(userName);
    }

    public void removeUser(final String userName) {
        if (!userMap.containsKey(userName)) {
            throw new NoSuchUserPresent(userName + " Invalid User");
        }
    }

    public void followUser(final String userName) {
        if (!userMap.containsKey(userName)) {
            throw new NoSuchUserPresent(userName + " Invalid User");
        }
    }

    public void addPost(Post post) {
        postMap.put(post.getId(), post);
    }


    public void upvotePost(long postId) {

    }

    public void downVotePost(final long postId) {

    }

    public void replyPost(final long postId, final String message) {

    }

    public List<Post> getAllPost() {
        if (activeUser == null) {
            throw new NoActiveUser("No user is logIn");
        }
        List<Long> postId = userPost.getOrDefault(activeUser.getUserName(), null);
        List<Post> res = postId.stream().map((e) -> (postMap.get(e))).collect(Collectors.toList());
        return res;
    }

    public void addFollower(final String userName) {
        if (userMap.containsKey(userName)) {
            throw new NoSuchUserPresent(userName + " : invalid user");
        }
        if (!followerMap.containsKey(activeUser.getUserName())) {
            followerMap.put(activeUser.getUserName(), new ArrayList<>());
        }
        followerMap.get(activeUser.getUserName()).add(userName);
    }
}
