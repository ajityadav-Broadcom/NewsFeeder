package com.Ajit.command;

import com.Ajit.exception.InvalidCommandException;
import com.Ajit.service.NewFeedService;

public class FollowCommandExecutor extends CommandExecutor {
    public FollowCommandExecutor(NewFeedService newFeedService) {
        super(newFeedService);
    }

    private boolean validateCommand(String args[]) {
        if (args.length != 2) return false;
        return true;
    }

    @Override
    public void executeCommand(Command command) {
        if (!validateCommand(command.getArgs())) {
            throw new InvalidCommandException(command.getArgs().toString() + "Invalid command is passed for execution");
        }
        String args[] = command.getArgs();
        newFeedService.followUser(args[1]);
    }
}
