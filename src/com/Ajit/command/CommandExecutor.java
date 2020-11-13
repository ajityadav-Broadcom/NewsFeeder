package com.Ajit.command;

import com.Ajit.service.NewFeedService;

public abstract class CommandExecutor {
    protected NewFeedService newFeedService;

    public CommandExecutor(NewFeedService newFeedService) {
        this.newFeedService = newFeedService;
    }

    public abstract void executeCommand(Command command);
}
