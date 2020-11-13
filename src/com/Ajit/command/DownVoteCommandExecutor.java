package com.Ajit.command;

import com.Ajit.service.NewFeedService;

public class DownVoteCommandExecutor extends CommandExecutor {
    public DownVoteCommandExecutor(NewFeedService newFeedService) {
        super(newFeedService);
    }

    @Override
    public void executeCommand(Command command) {

    }
}
