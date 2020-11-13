package com.Ajit.command;

import com.Ajit.service.NewFeedService;

public class UpVoteCommandExecutor extends CommandExecutor {
    public UpVoteCommandExecutor(NewFeedService newFeedService) {
        super(newFeedService);
    }

    @Override
    public void executeCommand(Command command) {

    }

}
