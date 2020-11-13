package com.Ajit.command;

import com.Ajit.service.NewFeedService;

public class FollowCommandExecutor extends CommandExecutor {
    public FollowCommandExecutor(NewFeedService newFeedService) {
        super(newFeedService);
    }

    @Override
    public void executeCommand(Command command) {

    }
}
