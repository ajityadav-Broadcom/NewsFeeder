package com.Ajit.command;

import com.Ajit.Modal.Post;
import com.Ajit.service.NewFeedService;

import java.util.List;

public class ShowNewsFeedCommandExecutor extends CommandExecutor {
    public ShowNewsFeedCommandExecutor(NewFeedService newFeedService) {
        super(newFeedService);
    }

    @Override
    public void executeCommand(Command command) {
        List<Post> postList = newFeedService.getAllPost();
        postList.forEach(e -> {
            System.out.println(e.getPostDescription());
        });
    }


}
