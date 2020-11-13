package com.Ajit.command;

import com.Ajit.service.NewFeedService;

public class ShowNewsFeedCommandExecutor extends CommandExecutor {
    public ShowNewsFeedCommandExecutor(NewFeedService newFeedService) {
        super(newFeedService);
    }

    @Override
    public void executeCommand(Command command) {

    }


}
