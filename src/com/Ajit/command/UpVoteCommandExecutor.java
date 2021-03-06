package com.Ajit.command;

import com.Ajit.exception.InvalidCommandException;
import com.Ajit.service.NewFeedService;

public class UpVoteCommandExecutor extends CommandExecutor {
    public UpVoteCommandExecutor(NewFeedService newFeedService) {
        super(newFeedService);
    }

    private boolean validateCommand(String args[]) {
        if (args.length != 2) return false;
        return true;
    }

    @Override
    public void executeCommand(Command command) {
        if (!validateCommand(command.getArgs())) {
            throw new InvalidCommandException(command.getArgs().toString() + " invalid command is passed for execution");
        }
        String args[] = command.getArgs();
        newFeedService.downVotePost(Long.parseLong(args[1]));
    }

}
