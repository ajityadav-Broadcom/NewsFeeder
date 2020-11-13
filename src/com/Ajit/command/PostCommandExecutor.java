package com.Ajit.command;

import com.Ajit.service.NewFeedService;

public class PostCommandExecutor extends CommandExecutor {
    public PostCommandExecutor(NewFeedService newFeedService) {
        super(newFeedService);
    }

    @Override
    public void executeCommand(Command command) {

    }
}
